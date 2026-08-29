class CheckArraySortedAndRotated {
    public static boolean check(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i+1]) {
                //found rotated
                i++;
                int j = 0;
                while(j < n - 1) {
                    int curr = arr[i%n];
                    int next = arr[(i+1)%n];
                    if(curr > next) {
                        return false;
                    }
                    j++; i++;
                }
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        System.out.println(check(arr));
    }
}