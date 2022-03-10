package easy;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
    }

    public static int binarySearch(int[] array, int target) {
        // Write your code here.

        if (array.length < 1) return -1;

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;

            System.out.println(mid + " " + left + " " + right);

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
