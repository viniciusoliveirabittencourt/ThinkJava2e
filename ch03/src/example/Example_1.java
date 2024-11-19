package example;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.println("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
    }
}
