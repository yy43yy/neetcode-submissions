class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Deque <Character> stack = new ArrayDeque<>();
        char [] chars = s.toCharArray();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(int i =0; i<chars.length;i++){
            if(chars[i]=='(' || chars[i]=='[' || chars[i]=='{' ){
                stack.push(chars[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char curr = stack.pollFirst();
                if(curr!=map.get(chars[i])){
                    return false;
                }
            }
        }
        
        if(!stack.isEmpty()) return false;

        return true;
    }
}
