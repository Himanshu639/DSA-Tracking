import java.util.Arrays;

class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        // first arr starts from start
        // second arr starts from mid(included)
        // both arrays are sorted already
        int[] auxArr = new int[end-start];
        int len1 = mid - start;
        int len2 = end - mid;

        int i = start;
        int j = mid;
        int k = 0;
        while(i < start+len1 && j < mid+len2) {
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
    public static void sortHelper(int[] arr, int start, int end) {
        if(end - start <= 1) { // single or no element
            return;
        }
        // int mid = (start+end)/2;
        int mid = start + (end - start) / 2;
        sortHelper(arr, start, mid);
        sortHelper(arr, mid, end);
        merge(arr, start, mid, end);
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        sortHelper(arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2}; 
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// 5,2,9,1,3,7,4,0
// 2,5,9,1,3,7,4,0
// 
