package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidSubSequence {

    public static void main(String[] args) {

        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10)));
        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 101), Arrays.asList(1, 6, -1, 10)));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.

        //Optimized approach
        int p = 0, q = 0;

        while (p < array.size() && q < sequence.size()) {

            if (Objects.equals(array.get(p), sequence.get(q))) {
                p++;
                q++;
            } else p++;
        }
        return !(q < sequence.size());


        //Alternative

        /*int j = 0, i = 0;

        while (i < sequence.size()) {
            while (j < array.size()){
                if (Objects.equals(array.get(j), sequence.get(i))){
                    i++;
                    j++;
                    break;
                }
                j++;
            }
            if (j >= array.size() && i < sequence.size()) return false;
        }

        return i == sequence.size();*/

    }
}
