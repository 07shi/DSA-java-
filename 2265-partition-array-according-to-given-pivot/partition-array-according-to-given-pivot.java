class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int num : nums){
            if(num<pivot){
                smaller.add(num);
            }
            else if(num == pivot){
                equal.add(num);
            }
            else{
                greater.add(num);
            }
        }
        int[] result = new int[nums.length];
        int x = 0;
        for(int num:smaller){
            result[x++] = num;
        }
        for(int num:equal){
            result[x++] = num;
        }
        for(int num:greater){
            result[x++] = num;
        }
        return result;
    }
}