class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        List<Integer> list = new ArrayList<>() ; 
        for (int i = 0 ; i < nums.size() ; i++ ) {
            boolean flag = true ; 
            for (int j = 1 ; j <= nums.get(i) ; j++ ) {
                int op = j | (j+1) ;
                if (op == nums.get(i)) {
                    list.add(j) ; 
                    flag = true ; 
                    break ;
                }else {
                    flag = false ; 
                }
                
            }
            if(!flag) {
                list.add(-1) ; 
                flag = true ; 
            }
        }
        int arr[] = new int[nums.size()] ; 
        for (int i = 0 ; i < list.size() ; i++ ) {
            arr[i] = list.get(i) ; 
        }
        return arr ; 
    }
}