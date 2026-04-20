class Solution {
    public int maxDistance(int[] colors) {
        int mx = 0;
        for(int i = 0;i<colors.length;i++){
            for(int j = i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    mx = Math.max(mx , j - i);
                }
                
            }
        }
        return mx;
    }
}