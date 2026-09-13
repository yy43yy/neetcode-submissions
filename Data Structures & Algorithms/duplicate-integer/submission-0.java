class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.getOrDefault(num,0)==1){
                return true;
            }

            map.put(num,1);
        }

        return false;
    }
}