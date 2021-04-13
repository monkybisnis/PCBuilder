package PCBuilder;

import Components.*;
import Components.Part.*;
import GUI.Menu;
import PCBuildInterface.BudgetPC;
import discount.Customer;
import discount.strategy.SaleStrategy;
import discount.strategy.Strategy;
import loginService.LoginService;
import payment.PaypalImplementor;
import payment.Payment;
import payment.StagedPayment;

import java.io.*;
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

                        cases.add( (Component)new Case(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[10])));
                        break;
                    case "CPU":
                        cpus.add((Component)new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), fields[8]));
                        //   components.add(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[8]));
                        break;
                    case "Fan":
                        fans.add((Component)new Fan(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6])));
                        break;
                    case "Graphics":
                        gpus.add((Component)new GPU(serialNumber, type, brand, price, wattage, Double.parseDouble(fields[6]), Integer.parseInt(fields[7])));
                        break;
                    case "RAM":
                        memoryModules.add((Component)new Memory(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6]), Integer.parseInt(fields[7])));
                        break;
                    case "MotherBoard":
                        motherboards.add((Component)new Motherboard(serialNumber, type, brand, price, wattage, fields[6], Integer.parseInt(fields[8])));
                        break;
                    case "PowerSupply":
                        psus.add((Component)new PSU(serialNumber, type, brand, price, wattage));
                        break;
                    case "Storage":
                        storageComponents.add((Component)new Storage(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[7])));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + fields[0]);

                }
            }

        }
        sc.close();

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
    }
}