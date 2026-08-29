import java.util.Arrays;

class InsertionSort {
    public static void sort(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 9, 2, 1, 3, 8, 5, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
