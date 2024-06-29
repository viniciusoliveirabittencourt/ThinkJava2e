package ch01;

// in java, we need to have some mandatory spaces, so, the command publicclassGoodbye will never work
public class Goodbye {
    public static void mian(String[] args) {
        // because I use print, the phrase don't break at end of line
        System.out.print("Goodbye, ");
        System.out.println("cruel world!");
    }
}

// but we have optional spaces, so this two it will work

//public class Goodbye {
//public static void main(String[] args) {
//because I use print, the phrase don't break at end of line
//System.out.print("Goodbye, ");
//System.out.println("cruel world!");
//}
//}

//public class Goodbye { public static void main(String[] args) { System.out.print("Goodbye, "); System.out.println("cruel world!"); } }
// It's not a good idea to use this king of indentation, because it's hard to read, so it's more difficulty to find bugs and errors