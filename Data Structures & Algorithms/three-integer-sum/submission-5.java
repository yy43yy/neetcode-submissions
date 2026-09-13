class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];

            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                if(nums[l]+nums[r]==target){
                    List<Integer> trip = new ArrayList<>();

                    trip.add(nums[i]);
                    trip.add(nums[l]);
                    trip.add(nums[r]);
                    result.add(trip);
                    l++;
                    r--;

                while(l<r & nums[l]==nums[l-1]){
                    l++;
                }
                while(l<r & nums[r]==nums[r+1]){
                    r--;
                }
                }
                
                else if(nums[l]+nums[r]>target){
                    r--;
                }
                else if(nums[l]+nums[r]<target){
                    l++;
                }
            }
        }
        return result;
    }
}
