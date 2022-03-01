package easy;

import java.util.Arrays;

public class TwoNumberSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
        System.out.println(Arrays.toString(twoNumberSum(new int[]{3, 5}, 8)));
        System.out.println(Arrays.toString(twoNumberSum(new int[]{3}, 10)));
        System.out.println(Arrays.toString(twoNumberSum(new int[0], 10)));
    }

    /*
        Use 2 for loops
        Can use HashMap as well!
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        if (array.length < 2) return new int[0];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == targetSum) return new int[]{array[i], array[j]};
            }
        }
        return new int[0];
    }
}
