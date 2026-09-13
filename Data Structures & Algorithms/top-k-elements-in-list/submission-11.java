class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List [nums.length+1];
        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        map.forEach((y,v)->{buckets[v].add(y);});

        int [] result = new int[k];
        int temp = k-1;
        int curr = nums.length;
        while(temp>=0){
            if(buckets[curr].size()>0){
                result[temp] = buckets[curr].get(0);
                buckets[curr].remove(0);
                temp--;
                continue;
            }else{
                curr--;
            }
        }
        return result;
    }
}
