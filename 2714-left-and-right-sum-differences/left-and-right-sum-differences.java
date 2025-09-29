class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        leftsum[0] = 0;
        for(int  i = 1;i<nums.length;i++){
            leftsum[i] = nums[i-1] + leftsum[i-1];
        }
        rightsum[nums.length-1] = 0;
        for(int i = nums.length-2;i>=0;i--){
            rightsum[i]  = rightsum[i+1] + nums[i+1];
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int diff;
            if (leftsum[i] - rightsum[i] < 0) {
                diff = rightsum[i] - leftsum[i];
            } else {
                diff = leftsum[i] - rightsum[i];
            }
            ans[i] = diff;
        }

        return ans;
    
    }
}