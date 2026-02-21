import java.util.Arrays;

public class startingandendingindex {

    public static void main(String[] args) {

        int[] arr = {1,2,7,7,7,8,9,10};   // ⚠ must be sorted
        int target = 7;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        int[] result = {first, last};

        System.out.println(Arrays.toString(result));
    }

    // Find first occurrence
    static int findFirst(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < target) {
                s = mid + 1;
            }
            else if (arr[mid] > target) {
                e = mid - 1;
            }
            else {
                ans = mid;      // store answer
                e = mid - 1;    // move left
            }
        }

        return ans;
    }

    // Find last occurrence
    static int findLast(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < target) {
                s = mid + 1;
            }
            else if (arr[mid] > target) {
                e = mid - 1;
            }
            else {
                ans = mid;      // store answer
                s = mid + 1;    // move right
            }
        }

        return ans;
    }
}
