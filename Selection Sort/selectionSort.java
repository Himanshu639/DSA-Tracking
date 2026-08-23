// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class selectionSort {
    public static int[] sort(int[] arr) {
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
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,8,4,7,9,3,0,6};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
