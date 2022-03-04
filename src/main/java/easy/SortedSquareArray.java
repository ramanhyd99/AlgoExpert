package easy;

import java.util.Arrays;

public class SortedSquareArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-4, 1, 2})));
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-4, -2, 1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{4})));
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.

        if (array.length < 1) return array;

        int left = 0;
        int right = array.length - 1;

        int res[] = new int[array.length];
        int index = array.length - 1;

        while (left <= right) {

            if (Math.abs(array[left]) > Math.abs(array[right])) {
                res[index] = array[left] * array[left];
                left++;
            } else {
                res[index] = array[right] * array[right];
                right--;
            }
            index--;
        }

        return res;
    }

}
