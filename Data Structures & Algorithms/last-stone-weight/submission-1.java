class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int s1 =pq.poll();
            int s2 =pq.poll();
            
            int left = s1 -s2;

            if(left!=0){
                pq.offer(left);
            }

        }

        if(pq.size()==0) return 0;
        return pq.poll();
    }
}
