class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int option_1 = nums[n] * nums[n-1] * nums[n-2];
        int option_2 = nums[0] * nums[1] * nums[n];
        int ans = Math.max(option_1, option_2);
        return ans;
    }
}
