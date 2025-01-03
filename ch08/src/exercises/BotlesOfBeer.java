package exercises;

public class BotlesOfBeer {
    public static void singTheSong(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println();
            System.out.println(bottles + " bottles of beer on the wall,");
            System.out.println(bottles + "bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            singTheSong(--bottles);
        }
    }
    public static void main(String[] args) {
        singTheSong(99);
    }
}
