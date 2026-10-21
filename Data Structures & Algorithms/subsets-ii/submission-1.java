class Solution {
    private List<List<Integer>> result = new ArrayList<>(); 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,path);

        return result;
    }

    public void backtrack(int[] nums, int index, List<Integer> path){
        if(index >= nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[index]);

        backtrack(nums,index+1,path);
        path.remove(path.size()-1);
        
        int nextIndex = index +1;
        while(nextIndex<nums.length && nums[index] == nums[nextIndex]){
            nextIndex++;
        }

        backtrack(nums,nextIndex,path);
    }
}
