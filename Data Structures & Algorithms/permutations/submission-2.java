class Solution {
    private List<List<Integer>>  result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        backtrack(nums,visited,path);
        return result;
    }
    public void backtrack(int[] nums,boolean[] visited, List<Integer> path){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
        }
        for(int i = 0; i<nums.length;i++){
            if(visited[i]==true) continue;

            path.add(nums[i]);
            visited[i] = true;
            backtrack(nums,visited,path);
            
            path.remove(path.size()-1);
            visited[i] = false;
        }


    }
}
