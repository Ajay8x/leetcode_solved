class Solution {
    public int[] runningSum(int[] nums) {
        // Modify nums in-place to store running sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}