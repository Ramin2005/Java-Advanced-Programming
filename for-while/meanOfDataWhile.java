
import java.util.ArrayList;
import java.util.Scanner;

public class meanOfDataWhile {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> data = new ArrayList<>();

        System.out.println("Enter the data:");
        while (sc.hasNext()) {

            data.add(sc.nextDouble());

        }

        double mean = mean(data);

        System.out.printf("mean of data: %.3f", mean);
    }

    public static double mean(ArrayList<Double> data) {
        double out = 0;

        for (double d : data)
            out += d;

        out /= data.size();

        return out;
    }
}
