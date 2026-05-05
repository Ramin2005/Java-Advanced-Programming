import java.util.Arrays;

public class Array {
    void main() {
        // initializing a 1D array
        int[] nums_1 = new int[5];
        int[] nums_2 = { 3, 1, 6, 8 };
        char[] chs = { 'A', 'B', 'C' };

        // printing address of an array
        System.out.println(nums_1);

        // print array elements
        System.out.print("nums_1: ");
        for (int i = 0; i < nums_1.length; i++)
            System.out.print(nums_1[i] + " ");
        System.out.println();

        // getting length of an array
        int len = nums_1.length;
        System.out.println("length: " + len);

        // getting an element of an array
        int x = nums_1[2];
        System.out.println("x: " + x);

        // changing an element of an array
        nums_1[0] = 10;
        // print array elements
        System.out.print("nums_1 after changing value of index 0: ");
        for (int i = 0; i < nums_1.length; i++)
            System.out.print(nums_1[i] + " ");
        System.out.println();

        // print array elements
        System.out.print("\nnums_2: ");
        for (int i = 0; i < nums_2.length; i++)
            System.out.print(nums_2[i] + " ");
        System.out.println();

        Arrays.sort(nums_2);
        // print array elements
        System.out.print("nums_2 after sorting: ");
        for (int i = 0; i < nums_2.length; i++)
            System.out.print(nums_2[i] + " ");
        System.out.println();

        // initializing a n-D array
        int[][] matrix_1 = new int[4][5];
        int[][][] tensor_1 = new int[3][4][5];

        // print array elements
        System.out.println("\nmatrix_1: ");
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length; j++) {
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println();
        }

        // jagged array
        int[][] nums_3 = { { 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8, 9 } };

        // print array elements
        System.out.println("\nnums_3: ");
        for (int i = 0; i < nums_3.length; i++) {
            for (int j = 0; j < nums_3[i].length; j++) {
                System.out.print(nums_3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] nums_4 = new int[3][];
        nums_4[0] = new int[2];
        nums_4[1] = new int[1];
        nums_4[2] = new int[10];

        // print array elements
        System.out.println("\nnums_4: ");
        for (int i = 0; i < nums_4.length; i++) {
            for (int j = 0; j < nums_4[i].length; j++) {
                System.out.print(nums_4[i][j] + " ");
            }
            System.out.println();
        }
    }

}