package moveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeros(nums);
    }
}

class Solution {
    public void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                nums[j] = nums[i];
                j++;

            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }


    }
}
