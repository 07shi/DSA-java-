class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(num % 2 == 0){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        int mxfreq = 0;
        if(map.isEmpty()){
            return -1;


        }
        int result= -1;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > mxfreq){
                mxfreq = freq;
                result = key;
                

            }
            else if(freq == mxfreq && key < result){
                result = key;
            }

        }
        return result;


    }
}