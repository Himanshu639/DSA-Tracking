import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void recursiveInsert(int[] arr, int n) {
        if(n <= 1) {
            return;
        } 
        recursiveInsert(arr, n-1);
        int last = arr[n-1];
        int j = n - 2;
        while(j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j]; 
            j--;
        }
        arr[j+1] = last;
    }
    public static void sort(int[] arr) {
        recursiveInsert(arr, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,1,2,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}