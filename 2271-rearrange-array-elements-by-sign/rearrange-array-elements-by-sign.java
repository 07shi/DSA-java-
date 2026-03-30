class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ne = nums.length;
        int pos[] = new int[ne/2];
        int neg[] = new int[ne/2];
        int p = 0;
        int n = 0;
        for(int i = 0;i<ne;i++){
            if(nums[i]>0){
                pos[p++] = nums[i];
            }
            else{
                neg[n++] = nums[i];
            }
        }
        int result[] = new int[ne];
        int i = 0;
        p=0;
        n=0;
        while(i<ne){
            result[i++] = pos[p++];
            result[i++] = neg[n++];
        }
        return result;

    }
}