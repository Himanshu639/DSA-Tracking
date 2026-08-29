import java.util.Arrays;

/**
 * RotateArrayByKPlaces
 */
public class RotateArrayByKPlaces {

    public static void reverseArray(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverseArray(nums, 0, n-k-1);
        reverseArray(nums, n-k, n-1);
        reverseArray(nums, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}