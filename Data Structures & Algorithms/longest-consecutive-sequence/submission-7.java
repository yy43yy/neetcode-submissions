class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int num: nums){
            set.add(num);
        }

        for(int num:nums){
            
            
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
            result = Math.max(result,count);
            
            }
        }




        return result;

        
    }
}
