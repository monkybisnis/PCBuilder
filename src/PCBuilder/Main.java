package PCBuilder;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("cpu.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
    }
}
