package Arrays;
// import java.util.Arrays.*;

public class ArrayDemo {
    public static void main(String[] args) {

        // boolean num[] = new boolean[10];
        // for (boolean n : num) {
        // System.out.println(n);
        // }

        // Single dimension array
        int nums[] = { 3, 4, 2, 1, 5 };
        nums[1] = 4909;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Multidimensional Array
        int mul[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int[] is : mul) {
            for (int is2 : is) {
                System.out.print(is2 + " ");

            }
            System.out.println();
        }

        // Add random numbers to multidimensional array
        int multiArray[][] = new int[5][5];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (int) (Math.random() * 10);

            }
        }

        for (int[] arr : multiArray) {
            for (int num : arr) {
                System.out.print(num + " ");

            }
            System.out.println();
        }

        // Jagged array
        int array[][] = new int[4][]; // Jagged array;

        array[1] = new int[3];
        array[0] = new int[6];
        array[2] = new int[2];
        array[3] = new int[4];

        array[1][2] = 100; 

        // Three dimensional array;
        int threeArr[][][] = new int[3][5][7];

    }
}