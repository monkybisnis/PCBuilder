package loginService;

import discount.Cart;
import discount.Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

//class  LoginService provides 3 static methods, login, logout and register
public class LoginService {
    public static Customer currentCustomer = null;
    static Cart cart;

    // incorrect login if either name does not exist or pw does not exist
    // for incorrect login return null
    // for correct login return a customer object
    // and set the value of the static variable currentCustomer to this customer Object.
    public static Customer login() {
        cart = new Cart();
        currentCustomer = new Customer("Guest", cart);
        return currentCustomer;
    }

    public static Customer login(String name, String password){
        FileInputStream f = null;
        try {
            f = new FileInputStream("data/password.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1) ;
        }

        Scanner scan = new Scanner(f);
        Customer customer = null;
        Boolean found = false;

        while(scan.hasNext()){
            String line = scan.nextLine();
            String [] parts = line.split(",");

            if(name.equals(parts[0]) && password.equals(parts[1])){
                int points =Integer.parseInt(parts[2]);
                cart = new Cart();
                customer = new Customer(name, password, points, cart);
                customer.updateState();
                cart.setCustomer(customer);
                currentCustomer = customer;
                found = true;
                break;
            }
        }

        if(!found){
            return null;
        }
        else{
            return customer;
        }
    }

    public static void logout(){
        currentCustomer = null;
    }

    // if customer with this name already exists in pw file, returns null
    // otherwise returns customer object with name and points fields set
    public static Customer register(String name, String password){
        FileOutputStream o = null;
        FileInputStream f = null;
        try {
            f = new FileInputStream("data/password.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1) ;
        }

        Scanner scan = new Scanner(f);
        Customer customer = null;
        Boolean found = false;

        while(scan.hasNext()){
            String line = scan.nextLine();
            String [] customerAuth = line.split(",");

            if(name.equals(customerAuth[0])){
                found = true;
                break;
            }
        }
        if(found){
            return null;
        }
        else
        {
            String line = name + "," + password + "," + 0;
            try {
                o = new FileOutputStream("data/password.txt", true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            PrintWriter p = new PrintWriter(o);
            p.print("\n" + line);
            p.close();
            customer = new Customer(name, password, 0, cart);
            currentCustomer = customer;
            return customer;
        }
    }
}
