import java.util.*;

public class MinimumIncremented {
    public static int minimum_Moves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                moves += (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i - 1] + 1;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 0, 2};
        System.out.println(minimum_Moves(nums)); // ✅ prints 7
    }
}