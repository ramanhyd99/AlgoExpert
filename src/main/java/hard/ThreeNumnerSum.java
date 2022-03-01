package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumnerSum {

    public static void main(String[] args) {

        for (Integer[] x : threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0)) {
            System.out.println(Arrays.toString(x));
        }
    }


    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.

        List<Integer[]> list = new ArrayList<>();

        if (array.length < 3) return list;

        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {

            int left = i + 1, right = array.length - 1, sumLeft = targetSum - array[i];

            while (left < right) {
                if (array[left] + array[right] == sumLeft) {
                    list.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (array[left] + array[right] > sumLeft) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return list;
    }
}
