class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int totalsum= 0;
        for(int num: nums){
            totalsum += num;

        }
        int leftsum = 0;
        for(int i = 0;i<n;i++){
            totalsum -= nums[i];
            answer[i] = Math.abs(leftsum - totalsum);
            leftsum += nums[i];
        }
        return answer;

    }
}