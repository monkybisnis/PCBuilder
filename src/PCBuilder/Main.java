package PCBuilder;

import Components.*;
import Components.Component.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

        components.addComponents(cases, cpus, gpus, memoryModules, motherboards, psus, storageComponents);

        Scanner sc = new Scanner(new File("PCParts/parts.csv"));

        //parse cpus
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");

            String serialNumber = fields[1];
            String type = fields[2];
            double price = Double.parseDouble(fields[5]);
            double wattage = Double.parseDouble(fields[9]);
            String brand = fields[3];

            switch (fields[0]) {
                case "Case":
                    //components.add(new Case(serialNumber, type, brand, price, wattage));
                    break;
                case "Cpu":
                    cpus.addCPU(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[8]));
                 //   components.add(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[8]));
                    break;

                case "Gpu":
                    gpus.addGPU(new GPU(serialNumber,type, brand, price, wattage,  Double.parseDouble(fields[6]), Integer.parseInt(fields[7])));
                    break;
                case "RAM":
                    memoryModules.addMemory(new Memory(serialNumber, type, brand, price, wattage,Integer.parseInt(fields[6]),Integer.parseInt(fields[7])));
                    break;
                case "MotherB":
                    motherboards.addMotherboard(new Motherboard(serialNumber, type, brand ,price, wattage,fields[6], Integer.parseInt(fields[8])));
                    break;
                case "PowerSupply":
                    psus.addPSU(new PSU(serialNumber, type,brand, price, wattage));
                    break;
                case "Storage":
                    storageComponents.addStorage(new Storage(serialNumber, type,brand, price, wattage, Integer.parseInt(fields[7])));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + fields[0]);

            }


        }
        sc.close();
    }
}