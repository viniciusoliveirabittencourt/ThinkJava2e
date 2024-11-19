package example;

import java.util.Scanner;

public class ScanBug {
    public static void main(String[] args) {
        String str;
        double dou;
        int in;
        Scanner scan = new Scanner(System.in);

        dou = scan.nextDouble();
        in = scan.nextInt();
        scan.nextLine();
        str = scan.nextLine();

        System.out.println(dou);
        System.out.println(in);
        System.out.println(str);
    }
}
