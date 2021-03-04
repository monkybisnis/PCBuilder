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

            String serialNumber = fields[1];
            String type = fields[2];
            double price = Double.parseDouble(fields[3]);
            double wattage = Double.parseDouble(fields[4]);
            String brand = fields[5];

            switch (fields[0]) {
                case "CPU":
                    components.add(new CPU(serialNumber, type, price, wattage, brand, Double.parseDouble(fields[6]), Integer.parseInt(fields[7]), fields[8]));
                    break;
            }
        }
        sc.close();
    }
}
