import java.util.Arrays;

public class RotateArrayByOnePlace {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n-1];
        for(int i = n - 2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}