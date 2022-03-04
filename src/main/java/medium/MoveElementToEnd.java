package medium;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {
        System.out.println(moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2));
        System.out.println(moveElementToEnd(Arrays.asList(2, 2, 1, 1, 1), 2));

    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.

        if (array.size() < 2) return array;

        int i = 0, j = array.size() - 1;

        while (i < j) {

            if (array.get(j) == toMove) {
                if (array.get(i) == toMove) {
                    j--;
                } else {
                    i++;
                }
            } else {
                if (array.get(i) == toMove) {
                    array.set(i, array.get(j));
                    array.set(j, toMove);
                } else i++;
            }
        }

        return array;
    }

}
