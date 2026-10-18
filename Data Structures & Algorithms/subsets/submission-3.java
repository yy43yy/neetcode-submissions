class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path = new ArrayList<>();
        backtrack(nums,0,path); 

        return result;

    }

    public void backtrack(int[] nums, int index, List<Integer> path){
        if(index == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[index]);
        backtrack(nums,index+1,path);

        path.remove(path.size()-1);

        backtrack(nums,index+1,path);

    }
}
