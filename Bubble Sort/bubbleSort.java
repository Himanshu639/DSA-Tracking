import java.util.Arrays;

class bubbleSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; 
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

