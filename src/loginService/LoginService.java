package loginService;

import discount.Cart;
import discount.Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LoginService {
    static Customer currentCustomer = null;
    static Cart cart;

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
                cart = new Cart();
                int points =Integer.parseInt(parts[2]);
                customer = new Customer(name, password, points, cart);
                customer.updateState();
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
            String [] parts = line.split(",");

            if(name.equals(parts[0])){
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
            return customer;
        }
    }
}
