import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0; // i will stop at every zero to fill it
        int j = 0; // j will skip zeros
        int n = nums.length;
        while(j < n) {
            while(i < n && j < n && nums[i] != 0) {
                i++; j++;
            } 
            while(j < n && nums[j++] == 0);

            if(i >= n) break;
            nums[i++] = nums[j-1];
            nums[j-1] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,3,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
