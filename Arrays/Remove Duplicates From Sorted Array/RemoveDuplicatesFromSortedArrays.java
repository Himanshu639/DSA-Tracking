public class RemoveDuplicatesFromSortedArrays {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        int i = 1;
        int j = 0;
        int n = nums.length;
        while(i < n) {
            while(i < n && nums[j] == nums[i]) i++;
            if(i < n) nums[++j] = nums[i];
        }

        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int uniques = removeDuplicates(arr);
        
        for(int i = 0; i < uniques; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
