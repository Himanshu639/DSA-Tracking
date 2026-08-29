import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void sortHelper(int[] arr, int n) {
        if(n <= 1) {
            return;
        }
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sortHelper(arr, n-1);
    }
    public static void sort(int[] arr) {
        sortHelper(arr, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {8,4,1,2,5,6,7,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
