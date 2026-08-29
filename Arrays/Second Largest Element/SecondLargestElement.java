class SecondLargestElement {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largestElement = -1;
        int secondLargestElement = -1;
        for(int i = 0; i < arr.length; i++) {
            if(largestElement < arr[i]) {
                secondLargestElement = largestElement;
                largestElement = arr[i];
            } else if (largestElement > arr[i] && secondLargestElement < arr[i]) {
                secondLargestElement = arr[i];
            }
        }
        
        return secondLargestElement;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,1,5,7};
        System.out.println(getSecondLargest(arr));
    }
}