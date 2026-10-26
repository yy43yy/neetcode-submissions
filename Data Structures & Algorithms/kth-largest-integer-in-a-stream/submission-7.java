class KthLargest {
    private PriorityQueue <Integer> pq = new PriorityQueue<>();
    private final int k; 
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num: nums){
            if(pq.size()>=k){
                if(num>pq.peek()){
                    pq.poll();
                    pq.add(num);
                }

                continue;
            }else{
                pq.add(num);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()>=k){
                if(val>pq.peek()){
                    pq.poll();
                    pq.add(val);
                }

                
            }else{
                pq.add(val);
            }
            return pq.peek();
    }
}
