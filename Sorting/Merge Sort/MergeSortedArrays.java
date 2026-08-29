import java.util.Arrays;

class MergeSortedArrays {
    public static void merge(int[] arr, int start, int mid, int end) {
        // first arr starts from start
        // second arr starts from mid(included)
        // both arrays are sorted already
        int[] auxArr = new int[end-start];
        int len1 = mid - start;
        int len2 = end - mid;
        int minlen = len1 > len2? len2 : len1;

        int i = start;
        int j = mid;
        int k = 0;
        while(i < len1 || j < len2) {
            if(arr[i] < arr[j]) {
                auxArr[k++] = arr[i++]; 
            } else {
                auxArr[k++] = arr[j++];
            }
        }
        
        while(i < start+len1) {
            auxArr[k++] = arr[i++];
        }

        while(j < mid+len2) {
            auxArr[k++] = arr[j++];
        }

        //copying back to original array
        i = start;
        k = 0;
        while(k < end-start) {
            arr[i++] = auxArr[k++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        merge(arr, 0, 4, 8);
        System.out.println(Arrays.toString(arr));
    }
}
