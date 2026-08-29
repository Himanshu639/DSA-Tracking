class LargestElement {
    public static int largest(int[] arr) {
        // code here
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }
        
        return largestElement;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,1,5,7};
        System.out.println(largest(arr));
    }
}