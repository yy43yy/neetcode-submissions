class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] cars = new int [position.length][2];
        for(int i= 0; i<position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed [i];
        }

        Arrays.sort(cars,(a,b)->b[0]-a[0]);

        Deque<Double> stack = new ArrayDeque<>();
        
        
        for(int j = 0;j<position.length;j++){
            double time = (double)(target-cars[j][0])/cars[j][1];
            if(stack.isEmpty() || time>stack.peekFirst()) stack.addFirst(time);

        
        }

        return stack.size();
    }
}
