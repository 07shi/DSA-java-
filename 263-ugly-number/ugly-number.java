class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        
        int[] arr = {2,3,5};
        
        for(int i = 0;i<arr.length;i++){
            int x = arr[i];
            while(n%x == 0){
                n = n / x;

            }
        }
        return n == 1;
    }
}