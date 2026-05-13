import java.util.Scanner;

public class system_out {

    public static void main(String[] args) {
        clear();

        // print method
        System.out.print("Normal print!*");

        // println method
        System.out.println("Println");

        // printf
        System.out.printf("%s", "Printf");

        stop();
        clear();

        // \n -> next line
        System.out.println("\\n:");
        System.out.println("\n(Welcome to\\nJava Programming!) output:");
        System.out.print("Welcome to\nJava Programming!");
        // -> Welcome to
        // Java Programming!

        stop();
        clear();

        // \\ -> \
        System.out.println("\\\\:");
        System.out.println("\n(Welcome to \\\\Java\\\\ Programming!) output:");
        System.out.print("Welcome to \\Java\\ Programming!");
        // -> Welcome to \Java\ Programming!

        stop();
        clear();

        // \t -> tab
        System.out.println("\\t:");
        System.out.println("\n(Welcome to\\tJava\\tProgramming!) output:");
        System.out.print("Welcome to\tJava\tProgramming!");
        // -> Welcome to Java Programming!

        stop();
        clear();

        // \b -> back
        System.out.println("\\b:");
        System.out.println("\n(Welcome to *\\bJava*\\b Programming!) output:");
        System.out.print("Welcome to *\bJava*\b Programming!");
        // -> Welcome to Java Programming!

        stop();
        clear();

        // \" -> "
        System.out.println("\\\":");
        System.out.println("\n(Welcome to \\\"Java\\\" Programming!) output:");
        System.out.print("Welcome to \"Java\" Programming!");
        // -> Welcome to "Java" Programming!

        stop();
        clear();

        //
        // printf:
        System.out.println("printf():");
        System.out.printf("%s%n", "example: \"%s%n\"");

        stop();
        clear();

        // %d -> integer data types
        System.out.println("%d for integer data types:");
        System.out.println("\n(int n: %d) output:");
        System.out.printf("int n: %d", 1024);
        // -> int n: 1024

        stop();
        clear();

        // %.mf -> floating-point data types
        System.out.println("%.mf for floating-point data types:");
        System.out.println("\n(double d: %.3f) output:");
        System.out.printf("double d: %.3f", 12345.6789);
        // -> double d: 12345.678

        stop();
        clear();

        // %c -> char type
        System.out.println("%c for char type:");

        System.out.println("\n(char c: %c) and (65) output:");
        System.out.printf("char c: %c", 65);

        System.out.println("\n\n(char c: %c) and ('A') output:");
        System.out.printf("char c: %c", 'A');
        // -> char c: A

        stop();
        clear();

        // %s -> String
        System.out.println("%s:");
        System.out.println("\n(String s: %s) output:");
        System.out.printf("String S: %s", "Welcome to Java Programming!");
        // -> Welcome to Java Programming!

        stop();
        clear();

        // %b -> boolean type
        System.out.println("%b:");
        System.out.println("\n(boolean b: %b) output:");
        System.out.printf("boolean b: %b", true);
        // -> boolean b: true

        stop();
        clear();

        // %n -> next line
        System.out.println("%n:");
        System.out.println("\n(%s%n%s) output:");
        System.out.printf("%s%n%s", "Welcome to", "Java Programming!");
        // -> Welcome to 
        // Java Programming!

        stop();
        clear();
    }

    private static void clear() {
        System.out.print("\033[H\033[J");
    }

    private static void stop() {
        (new Scanner(System.in)).nextLine();
    }
}
