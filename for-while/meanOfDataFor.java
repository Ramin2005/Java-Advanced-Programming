
import java.util.Scanner;

public class meanOfDataFor {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of data: ");
        int n = sc.nextInt();

        double[] data = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.printf("Enter data number %d: ", i);
            data[i] = sc.nextDouble();

        }

        double mean = mean(data);

        System.out.printf("mean of data: %.3f", mean);
    }

    public static double mean(double[] data) {
        double out = 0;

        for (double d : data)
            out += d;

        out /= data.length;

        return out;
    }
}
