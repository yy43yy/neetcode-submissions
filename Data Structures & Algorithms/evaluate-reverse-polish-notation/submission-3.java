class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for(String str: tokens){
            if(isDegit(str)){
                stack.push(str);
            }else{
                int temp1 = Integer.parseInt(stack.pollFirst());
                int temp2 = Integer.parseInt(stack.pollFirst());
                int result = 0;
                if(str.equals("+") ){
                    result = temp1+temp2;
                }
                
                if(str.equals("-")){
                    result = temp2-temp1;
                }
                
                if(str.equals("*")){
                    result = temp1*temp2;
                }
                
                if(str.equals("/")){
                    result = temp2/temp1;
                }

                stack.push(Integer.toString(result));
            }
        }   

        int f = Integer.parseInt(stack.pollFirst());
        return f;

    }

    public boolean isDegit(String s){
        return !s.equals("+")
        && !s.equals("-")
        && !s.equals("*")
        && !s.equals("/");
    }
}
