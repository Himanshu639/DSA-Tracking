// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class SelectionSort {
    public static void sort(int[] arr) {
        if(arr == null && arr.length == 0) {
            return;
        }
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int smallestElementIdx = i;
            int smallestElement = arr[smallestElementIdx];
            for(int j = i + 1; j < n; j++) {
                if(smallestElement > arr[j]) {
                    smallestElement = arr[j];
                    smallestElementIdx = j;
                }
            }
            // Swapping
            int tmp = arr[i];
            arr[i] = smallestElement;
            arr[smallestElementIdx] = tmp;
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,8,4,7,9,3,0,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
