public class PrimitiveTypes {

    public static void main() {

        // numerical types:
        // 1. integers:
        // 1.1. byte - size: 8 bits - range: -128 to 127
        byte integer_1 = 127;
        System.out.printf("integer_1: %d\n", integer_1);

        // 1.2. short - size: 16 bits - range: -32,768 to 32,767
        short integer_2 = 32_767;
        System.out.printf("integer_2: %d\n", integer_2);

        // 1.3. int - size: 32 bits - range: -2,147,483,648 to 2,147,483,647
        int integer_3 = 2_147_483_647;
        System.out.printf("integer_3: %d\n", integer_3);

        // 1.4. long - size: 64 bits - range: -9,223,372,036,854,775,808 to
        // 9,223,372,036,854,775,807
        // long integer_4 = 9_223_372_036_854_775_807; for linux and macOS *
        long integer_4 = 2_147_483_647; // windows
        System.out.printf("integer_4: %d\n", integer_4);

        // 2. floating-point types:
        // 2.1. float - size: 32 bits
        // negative
        float floating_point_1_1 = (float) -3.402_823_466_385_288_6E38;
        System.out.println("floating_point_1_1: " + floating_point_1_1);
        // positive
        float floating_point_1_2 = (float) 3.402_823_466_385_288_6E38;
        System.out.println("floating_point_1_2: " + floating_point_1_2);

        // 2.2. double - size: 64 bits
        // negative
        double floating_point_2_1 = -1.797_693_134_862_315_7E308;
        System.out.println("floating_point_2_1: " + floating_point_2_1);
        // positive
        double floating_point_2_2 = 1.797_693_134_862_315_7E308;
        System.out.println("floating_point_2_2: " + floating_point_2_2);

        // Non-numerical types:
        // 1. char - size: 16 bits - values: "\u0000" to "\uffff"
        char char_1 = 'A';
        System.out.printf("char_1: %c\n", char_1);

        char char_2 = '\u0041';
        System.out.printf("char_2: %c\n", char_2);

        // 2. boolean - size: 1 bit or 8 bits;
        boolean boolean_1 = true;
        System.out.printf("boolean_1: %b\n", boolean_1);
    }

}