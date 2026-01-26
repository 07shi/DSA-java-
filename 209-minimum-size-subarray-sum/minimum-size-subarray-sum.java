class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int cs = 0;
        int i = 0;
        int j = 0;
        int minLenw = Integer.MAX_VALUE;
        for(j=0;j<nums.length;j++ ){
            cs = cs + nums[j];
            while(cs >= target){
                int cw = j - i + 1;
                minLenw = Math.min(minLenw, cw);
                cs = cs - nums[i];
                i++;
            }
        }
        return minLenw == Integer.MAX_VALUE ? 0: minLenw;
    }
}