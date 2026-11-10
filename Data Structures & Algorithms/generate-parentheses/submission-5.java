class Solution {
    private List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        ArrayList<Character> path  = new ArrayList<>();
        backtrack(0,0,n,path);
        return result;
    }

    public void backtrack(int openCount, int closeCount,int n, ArrayList<Character> path){
        if(openCount<closeCount) return;

        if(path.size() == 2*n && openCount == closeCount){
            StringBuilder sb = new StringBuilder(path.size());
            for(Character ch:path){
                sb.append(ch);
            }
            result.add(sb.toString());
        }
        if(path.size()>2*n) return;

        path.add('(');
        backtrack(openCount+1,closeCount,n,path);
        path.remove(path.size()-1);
        path.add(')');
        backtrack(openCount,closeCount+1,n,path);
        path.remove(path.size()-1);

    }


}
