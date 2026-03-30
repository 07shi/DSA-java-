class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ne = nums.length;
        int ans[] = new int[ne];
        int p = 0;
        int n = 1;
        for(int i = 0;i<ne;i++){
            if(nums[i]>0){
                ans[p] = nums[i];
                p += 2;
            }
            else{
                ans[n] = nums[i];
                n += 2;
            }
        }
        return ans;
        

    }
}