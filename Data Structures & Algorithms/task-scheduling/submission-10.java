class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for(char c:tasks){
            freq[c-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<26; i++){
            if(freq[i]>0){
                pq.offer(freq[i]);
            }
        }

        Deque<int[]> cooldown = new ArrayDeque<>();
        int timer = 0;
        while(!cooldown.isEmpty() || !pq.isEmpty()){
            timer++;
            if(!pq.isEmpty()){
                int time=pq.poll();

                if(time-1>0){
                    int[] cool = new int[]{time-1,timer+n};

                    cooldown.addLast(cool);
                }
            }
            if(!cooldown.isEmpty()){
                int[] potential = cooldown.peekFirst();
                if(potential[1] <=timer){
                    pq.offer(potential[0]);
                    cooldown.pollFirst();
                }
            }
        }

        return timer;
    }
}
