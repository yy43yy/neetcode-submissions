class Twitter {
    private HashMap<Integer, Set<Integer>> fmap = new HashMap<>();
        private HashMap<Integer,List<Pair<Integer,Integer>>> tmap = new HashMap<>();
        private int count = 0;
    public Twitter() {
        
        
        
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tmap.containsKey(userId)){
            List<Pair<Integer,Integer>> list = new ArrayList<>();
            tmap.put(userId,list);
        }

        tmap.get(userId).add(new Pair<>(count,tweetId));
        count++;

    }
    
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> following = fmap.getOrDefault(userId,new HashSet<>());
        List<List<Pair<Integer, Integer>>> temp = new ArrayList<>();
        
        if(tmap.containsKey(userId)){
            temp.add(tmap.get(userId));
        }

        for(int id: following){
            if (id != userId && tmap.containsKey(id)){
                temp.add(tmap.get(id));
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));

        for(int i = 0; i<temp.size();i++){
            List<Pair<Integer,Integer>> tweets = temp.get(i);
            Pair<Integer,Integer> latest = tweets.get(tweets.size()-1);
            int[] output = new int[]{latest.getKey(), i, 1};

            pq.offer(output);
        }

        List<Integer> result = new ArrayList<>();

        while(result.size()<10 && !pq.isEmpty()){
            int[] input = pq.poll();
            List<Pair<Integer,Integer>> user = temp.get(input[1]);
            Pair<Integer,Integer> latest = user.get(user.size() - input[2]);  
            result.add(latest.getValue());
            
            if(user.size()-input[2]-1>=0){
                Pair<Integer,Integer> next = user.get(user.size()-input[2]-1); 
                int[] n = new int[] {next.getKey(),input[1],input[2]+1};
                pq.offer(n);
            }
        }

        return result;
        

        
    }
    
    public void follow(int followerId, int followeeId) {
        if(!fmap.containsKey(followerId)){
            Set<Integer> set = new HashSet<>();
            fmap.put(followerId,set);
        }

        fmap.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (fmap.containsKey(followerId)){
            fmap.get(followerId).remove(followeeId);
        }
    }
}
