package PCBuilder;

import Components.*;
import Components.Part.*;
import GUI.UI;
import interceptor.*;
import loginService.LoginService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Components components;
    static Cases cases;
    static CPUs cpus;
    static GPUs gpus;
    static MemoryModules memoryModules;
    static Motherboards motherboards;
    static PSUs psus;
    static StorageComponents storageComponents;
    static Fans fans;
    //static List<Component> components = new ArrayList<>();
    public static Dispatcher dispatcher = new Dispatcher(new ReviewService());


    public static void main(String[] args) throws Exception {
        components = new Components();
        cases = new Cases();
        cpus = new CPUs();
        gpus = new GPUs();
        memoryModules = new MemoryModules();
        motherboards = new Motherboards();
        psus = new PSUs();
        storageComponents = new StorageComponents();
        fans = new Fans();
        ArrayList<ReviewObject> reviews;
        reviews = readReviews();

        writeReviews(reviews);

        ReviewService.readReviewsFromFile();

        Interceptor noCurse = new NoCurseInterceptor();
        Interceptor sentiment = new SentimentInterceptor();
        dispatcher.addInterceptor(noCurse);
        dispatcher.addInterceptor(sentiment);

        components.addComponents(cases, cpus, gpus, memoryModules, motherboards, psus, storageComponents, fans);

        Scanner sc = new Scanner(new File("PCParts/partss.csv"));

        //parse cpus
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");

            if (fields.length > 1) {
                String serialNumber = fields[1];
                String type = fields[2];
                double price = Double.parseDouble(fields[5]);
                double wattage = Double.parseDouble(fields[9]);
                String brand = fields[3];

                switch (fields[0]) {
                    case "Case":
                        cases.add(new Case(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[10]), fields[11]));
                        break;
                    case "CPU":
                        cpus.add(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), fields[8], fields[11]));
                        break;
                    case "Fan":
                        fans.add(new Fan(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6]), fields[11]));
                        break;
                    case "Graphics":
                        gpus.add(new GPU(serialNumber, type, brand, price, wattage, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[11]));
                        break;
                    case "RAM":
                        memoryModules.add(new Memory(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6]), Integer.parseInt(fields[7]), fields[11]));
                        break;
                    case "MotherBoard":
                        motherboards.add(new Motherboard(serialNumber, type, brand, price, wattage, fields[6], Integer.parseInt(fields[8]), fields[11]));
                        break;
                    case "PowerSupply":
                        psus.add(new PSU(serialNumber, type, brand, price, wattage, fields[11]));
                        break;
                    case "Storage":
                        storageComponents.add(new Storage(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[7]), fields[11]));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + fields[0]);

                }
            }

        }
        sc.close();
/*
        BudgetPC test = new BudgetPC(components);

        //String x = test.getStorage().printDetails();
       // System.out.println(x);

        double cost = test.getTotalCost();
        System.out.println(cost);
        cost = 1500;
        System.out.println("list price " + cost);

//        Customer customer = new Customer("joe");
//        customer.addPoints(2000);

        Customer customer = LoginService.login("joe", "1234");

        Strategy saleStrategy = new SaleStrategy();
        double discount = customer.calculateDiscount(cost, saleStrategy);
        double realPrice = cost - discount;
        System.out.println("discounted price " + realPrice);
        Payment payment = new StagedPayment();
        payment.setPaymentImplementor(new PaypalImplementor());
        payment.payForPC(realPrice);

        new Menu();

 */

        LoginService.login();
        UI.run(components);
    }

    public static ArrayList<ReviewObject> readReviews(){
        String line;
        String[] fields;
        ArrayList<ReviewObject> reviewsArrayList = new ArrayList<>();

        // try and catch block attempt to read reviews from file in data folder
        try {
            Scanner sc = new Scanner(new File("data/joe.review"));

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                fields = line.split(",");

                if(fields.length == 4){
                    reviewsArrayList.add(new ReviewObject(fields[0], fields[1], fields[2], fields[3]));
                }
                else {
                    String review = "";
                    if(fields.length < 4){
                        System.out.println("Review of this product is missing. We are sorry and can not show you this empty review. ");
                    } else {
                        for (int i = 3; fields.length > i; i++){
                            review += fields[i];
                            if(fields.length-1 > i){review += ",";}
                        }
                        reviewsArrayList.add(new ReviewObject(fields[0], fields[1], fields[2], review));
                    }
                }
            }
        } catch (Exception e){
            System.out.println("File not found!");
        }

        return reviewsArrayList;
    }

    public static void writeReviews (ArrayList<ReviewObject> reviews) {

        try {
            File directoryOfReviews = new File("data/joe.review");
            if (!directoryOfReviews.exists()){
                 directoryOfReviews.createNewFile();
            }
            FileWriter reviewsFileWriter = new FileWriter(directoryOfReviews);
            for(ReviewObject review: reviews){
                reviewsFileWriter.write(review.toStringForCSV() + "\n");
                System.out.println(review.toStringForCSV());
            }
            reviewsFileWriter.flush();
            reviewsFileWriter.close();
            int f=0;

            /*
            ObjectOutputStream EmployeesStream = new ObjectOutputStream(reviewsFile);

            for (Employees employees :  reviews) {
                EmployeesStream.writeObject(employees);
            }
            EmployeesStream.close(); */
        }  catch (IOException e) {
            System.out.println("Error occurred while saving a reviews");
            e.printStackTrace();
        }
    }
}