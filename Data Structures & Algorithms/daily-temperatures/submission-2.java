class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int [] result = new int [temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int temp = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peekFirst()]<temp){          
                int num = stack.pollFirst();
                result[num] = i -num;

            }

            stack.addFirst(i);
        }

        while(!stack.isEmpty()){
            result[stack.pollFirst()] =0;
        }

        return result;
    }
}
