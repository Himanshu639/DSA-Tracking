public class LinearSearch {
    public static int search(int arr[], int x) {
        // code here
        for(int i = 0; i < arr.length; i++) if(arr[i] == x) return i;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,0,7,5,8};
        int x = 10;
        System.out.println(search(arr, x));
    }
}
