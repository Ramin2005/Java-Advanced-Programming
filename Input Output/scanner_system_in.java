import java.util.Scanner;

public class scanner_system_in {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        clear();

        // nextInt()
        print("Enter integer(int): ");
        // getting integer with sc(Scanner obj) from console
        int int_1 = sc.nextInt();
        print("Entered int: " + int_1 + "\n");
        stop();
        clear();

        // nextLong()
        print("Enter integer(long): ");
        // getting integer with sc(Scanner obj) from console
        long long_1 = sc.nextLong();
        print("Entered long: " + long_1 + "\n");
        stop();
        clear();

        // nextDouble()
        print("Enter floating-point(double): ");
        // getting floating-point with sc(Scanner obj) from console
        double double_1 = sc.nextDouble();
        print("Entered double: " + double_1 + "\n");
        stop();
        clear();

        // next()
        print("Enter a word: ");
        // getting String with sc(Scanner obj) from console
        String string_1 = sc.next();
        print("Entered string: " + string_1 + "\n");
        stop();
        clear();

        // nextLine()
        print("Enter a string: ");
        // getting String with sc(Scanner obj) from console
        // ***
        sc.nextLine();
        String string_2 = sc.nextLine();
        print("Entered string: " + string_2 + "\n");
        stop();
        clear();

    }

    private static void clear() {
        System.out.print("\033[H\033[J");
    }

    private static void stop() {
        (new Scanner(System.in)).nextLine();
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
