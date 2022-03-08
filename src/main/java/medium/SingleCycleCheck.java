package medium;

public class SingleCycleCheck {
    public static void main(String[] args) {


        System.out.println(hasSingleCycle(new int[]{2, 3, 1, -4, -4, 2}));
        System.out.println(hasSingleCycle(new int[]{1, 1, 1, 1, 2}));

    }

    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.

        if (array.length < 1) return true;

        int visited = 0, index = 0;

        while (true) {
            if (visited == array.length){
                return index == 0;
            }
            if (array[index] == 0) return false;
            visited++;

            int jump = array[index];
            array[index] = 0;
            if (jump > 0) {
                index = (index + jump) % array.length;
            } else {
                jump = Math.abs(jump) % array.length;
                jump = array.length - Math.abs(jump);
                index = (index + jump) % array.length;
            }

        }
    }
}
