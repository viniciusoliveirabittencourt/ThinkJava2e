package examples;

public class Example_7 {
    public static void main(String[] args) {
        String fruit = "banana";

        System.out.println(fruit.indexOf('a'));
        System.out.println(fruit.indexOf('a', 2));
        System.out.println(fruit.indexOf("nan"));
        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2));
    }
}
