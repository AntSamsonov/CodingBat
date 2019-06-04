package Arrays;

public class Only14 {
    public boolean start(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        return true;
    }
}