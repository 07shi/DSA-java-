class Solution {
    public int maxSubArray(int[] nums) {
        int mxsum = Integer.MIN_VALUE;
        int csum = 0;
        for(int i = 0;i<nums.length;i++){
            csum += nums[i];
            if(csum>mxsum){
                mxsum = csum;
            }
            if(csum < 0)
            {
                csum = 0;
            }
        }
        return mxsum;
    }
}