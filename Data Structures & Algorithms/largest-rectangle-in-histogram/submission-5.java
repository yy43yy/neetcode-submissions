class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for(int i = 0;i<=heights.length;i++){
            
            int curr= (i==heights.length)? 0 :heights[i];


            while(!stack.isEmpty() && curr<heights[stack.peekLast()]){
                int height = heights[stack.pollLast()];
                int right = i;
                
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    int left = stack.peekLast();
                    width= right - left -1;
                }
                result = Math.max(result,height*width);
            }


            stack.addLast(i);


        }
        return result;
    }
}
