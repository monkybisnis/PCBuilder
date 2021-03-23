package PCBuilder;

import Components.*;
import Components.Component.*;
import PCBuildInterface.BudgetPC;

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

            System.out.println(fields.length);
             if(fields.length>1) {
                 String serialNumber = fields[1];
                 String type = fields[2];
                 double price = Double.parseDouble(fields[5]);
                 double wattage = Double.parseDouble(fields[9]);
                 String brand = fields[3];

                 switch (fields[0]) {
                     case "Case":
                         cases.addCase(new Case(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[10])));
                         break;
                     case "CPU":
                         cpus.addCPU(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), fields[8]));
                         //   components.add(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[8]));
                         break;
                     case "Fan":
                         fans.addFan(new Fan(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6])));
                         break;
                     case "Graphics":
                         gpus.addGPU(new GPU(serialNumber, type, brand, price, wattage, Double.parseDouble(fields[6]), Integer.parseInt(fields[7])));
                         break;
                     case "RAM":
                         memoryModules.addMemory(new Memory(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[6]), Integer.parseInt(fields[7])));
                         break;
                     case "MotherBoard":
                         motherboards.addMotherboard(new Motherboard(serialNumber, type, brand, price, wattage, fields[6], Integer.parseInt(fields[8])));
                         break;
                     case "PowerSupply":
                         psus.addPSU(new PSU(serialNumber, type, brand, price, wattage));
                         break;
                     case "Storage":
                         storageComponents.addStorage(new Storage(serialNumber, type, brand, price, wattage, Integer.parseInt(fields[7])));
                         break;
                     default:
                         throw new IllegalStateException("Unexpected value: " + fields[0]);

                 }
             }

        }
        sc.close();

        BudgetPC test = new BudgetPC(components);

        double x = test.getPowerConsumption();
        System.out.println(x);


        for (Part component : components.components) {
            if (component instanceof Cases) {
                Cases cases = (Cases)component;
                Case c = cases.extractCase(0);
                System.out.println(c.printDetails());
                break;
            }
        }
    }
}