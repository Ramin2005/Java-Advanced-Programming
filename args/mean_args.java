public class mean_args {

    public static void main(String[] args) {
        System.out.println("Start!");
        if (args.length > 0) {

            double[] data = new double[args.length];

            for (int i = 0; i < args.length; i++) {

                data[i] = Double.parseDouble(args[i]);

            }

            System.out.println(mean(data));

        } else {

            System.out.println("Error!");

        }
    }

    private static int mean(double[] data){
        var out = 0;

        for(double d: data){
            out += d;
        }

        out /= data.length;

        return out;
    }

}
