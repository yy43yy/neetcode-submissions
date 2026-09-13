class Solution {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();

        int [] leftMax = new int [height.length];
        int [] rightMax = new int [height.length];
        int result= 0;
        int left = 0;
        int right = height.length-1;
        leftMax[0] = 0;
        rightMax[0] = 0;
        for(int i =1; i<height.length;i++){

            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
            
        }

        for(int j = height.length-2;j>-1;j--){
            rightMax[j] = Math.max(rightMax[j+1],height[j+1]);
        }

        for(int m =0;m<height.length;m++){
            int area = Math.min(leftMax[m],rightMax[m]) - height[m];
            if(area<0) area = 0;

            result += area;

        }

    return result;
    }
}
