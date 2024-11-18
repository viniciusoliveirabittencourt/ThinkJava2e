package examples;

public class Example_2 {
    public static void main(String[] args) {
        int number;
        String word, food;
        number = 4;

        switch (number) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            default:
                word = "unknow";
                break;
        }

        System.out.println(word);

        food = "apple";

        switch (food) {
            case "apple":
            case "banana":
            case "cherry":
                System.out.println("Fruit!");
                break;
            case "asparagus":
            case "broccoli":
            case "carrot":
                System.out.println("Vegetable!");
                break;
            default:
                System.out.println("Unkow!");
                break;
        }
    }
}
