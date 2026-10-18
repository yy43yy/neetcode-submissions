class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> path = new ArrayList<>();
        backtrack(nums,target,0,path);
        return result;
    }

    public void backtrack(int[] nums, int target, int index, List<Integer> path){
        int total = 0;
        for(int n : path){
            total +=n;
        }
        if(index>=nums.length) return;
        if(total>target){
            return;
        }
        if(total == target){
            result.add(new ArrayList<>(path));
            return;
        }
        
        path.add(nums[index]);
        backtrack(nums,target,index,path);
        path.remove(path.size()-1);
        backtrack(nums,target,index+1,path);
    }
}
