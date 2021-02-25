package PCBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Component> components = new ArrayList<Component>();


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("cpu.csv"));

        //parse cpus
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            String serial = fields[0];
            double height = Double.parseDouble(fields[1]);
            double width = Double.parseDouble(fields[2]);
            double length = Double.parseDouble(fields[3]);
            double price = Double.parseDouble(fields[4]);

            int clockSpeed = Integer.parseInt(fields[5]);
            int cores = Integer.parseInt(fields[6]);
            components.add(new CPU(serial, height, width, length, price, clockSpeed, cores));
            System.out.printf("%s,%f,%f,%f,%f,%d,%d\n", serial, height, width, length, price, clockSpeed, cores);
        }
        sc.close();
    }
}
