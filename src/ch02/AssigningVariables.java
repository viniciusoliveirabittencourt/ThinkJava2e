package ch02;

public class AssigningVariables {
    public static void main(String[] args) {
        // this is a variable
        // this type of statement is called declaration, because I declare the "message" is the type "String"
        String message;

        // is good practices start a variable name with lowercase letter and with are compose, use camel case, like firstName, or myNameIsVinicius
        String firstName;
        String lastName;
        // you can declare two variables at same time
        int hour, minute;
        // how java are case-sensitive firstName != firstname != FirstName

        // these statements are called assignment, and is when we put value on a variable, like putting something on a drawer
        // the variable need to have the same value you pass to it, so you can't do message = 123; because message is String and 123 integer
        message = "Hello";
        hour = 11;
        minute = 59;

        // it's possible initialize a variable with the value
        String myString = "Hello World";
    }
}
