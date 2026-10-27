class Solution {

    List<List<Integer>> result = new ArrayList<>();    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>path = new ArrayList<>();
        backtrack(candidates,target,0,path,0);
        return result;
    }
    public void backtrack(int[]candidates,int target,int index, List<Integer> path,int sum){
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        if(sum>target){
            return;
        }

        if(index>=candidates.length){
            return;
        }
        
          
            path.add(candidates[index]);
            backtrack(candidates,target,index+1,path,sum+candidates[index]);
            path.remove(path.size()-1);

            while(index+1<candidates.length&& candidates[index]==candidates[index+1]){
                index++;
            }
            backtrack(candidates,target,index+1,path,sum);
        

        

        
        
        

        

    }
}
