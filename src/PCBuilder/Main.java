package PCBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Component> components = new ArrayList<Component>();


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("PCParts/parts.csv"));

        //parse cpus
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            String serial = fields[1];
            String type= fields[2];
            String Brand= fields[3];
            String Socket= fields[4];
            double price = Double.parseDouble(fields[5]);
            double clockSpeed = Double.parseDouble(fields[9]);
            int cores = Integer.parseInt(fields[10]);
            double wattage= Double.parseDouble(fields[17]);
           //components.add(new CPU(serial,type,Brand,Socket, price, wattage,clockSpeed, cores));
            System.out.printf("%s,%f,%f,%f,%f,%d,%d\n", serial,type,Brand,Socket, price, wattage,clockSpeed, cores);
        }
        sc.close();
    }
}
