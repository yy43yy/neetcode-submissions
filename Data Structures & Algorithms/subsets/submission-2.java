class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        backtrack(nums,0,current);

        return result;


    }

    public void backtrack(int[] nums, int index, List<Integer> current){
        
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(nums,index+1,current);

        current.remove(current.size()-1);

        backtrack(nums,index+1,current);
    }
}
