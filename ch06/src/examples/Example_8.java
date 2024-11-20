package examples;

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Play again? ");
        String answer = sc.nextLine();
        /*
        if (answer == "yes") {
            System.out.println("Let's go!");
        } else {
            System.out.println("Goodbye!");
        }
         */
        if (answer.equals("yes")) {
            System.out.println("Let's go!");
        } else {
            System.out.println("Goodbye!");
        }
    }
}
