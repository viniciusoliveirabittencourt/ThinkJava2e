package ch02;

public class OperatorsForStrings {
    public static void main(String[] args) {
        // you cannot use another operators on strings, but you can use +, this one will concat two strings or transform numbers in strings and concat them
        System.out.println("Hello, " + "World!");

        // this 2 outputs seems the same, but Java do the operations from de left to the right
        // so this one, it first does the number math, so 3 and concat 3 with "Hello"
        System.out.println(1 + 2 + "Hello");
        // this another one it starts concat "Hello1", and became "Hello12" on second concat
        System.out.println("Hello" + 1 + 2);
    }
}
