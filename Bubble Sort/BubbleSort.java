import java.util.Arrays;

class BubbleSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 9, 4, 6, 5, 8, 7, 0}; 
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

