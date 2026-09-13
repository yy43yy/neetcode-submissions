class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int fastest=0;
        int result=fastest;
        for(int num : piles){
            fastest = (num>fastest) ? num : fastest;
        }


        int slowest =1;

        while(slowest<=fastest){
            int mid = (slowest+fastest)/2;

            int time=0;

            for(int b: piles){
                time += Math.ceil((double)b/mid);
            }

            if(time<=h){
                result = mid;

                fastest= mid-1;
            }
            if(time>h){
                slowest=mid+1;
            }

           
        }

        return result;
    }
}
