package Basic;

public class basicString {

    public static void main(String[] args) {
        // String is a sequence of characters
        // It is immutable, meaning once created, it cannot be changed
        // Strings can be created using double quotes
        // Example of a string
        String s = "Hello World";
        // Print the string
        System.out.println(s);

        //You can also create a string directly on System.out.println.
        System.out.println("Hello World 2"); //

        //Combining strings
        String example = "Hello";
        System.out.println(example + " World 3");

        //Lastly you can do anything with strings that you can do with any other object
        String ex = "Hello ";
        String ex2 = "World 4";
        // Concatenation using the + operator
        System.out.println(ex + ex2);

    }

}
