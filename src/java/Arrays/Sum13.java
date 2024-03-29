package Arrays;

public class Sum13 {
    public int start(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 13){
                sum+=nums[i];
            }
            else if(nums[i] == 13 && i < nums.length-1){
                nums[i] = 0;
                nums[i+1] = 0;
            }
        }
        return sum;
    }
}
/*
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
