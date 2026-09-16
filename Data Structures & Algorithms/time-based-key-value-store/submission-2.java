class TimeMap {
    //When we store we store like key value and time 
    //if we get we get key and timestamp -> give value
    //if time stamp invalid return smallest not sure

    //idea a Hashmap and ArrayList where arraylist is the value ?? 
    HashMap<String, ArrayList<Pair<Integer,String>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair<Integer,String> pair = new Pair<>(timestamp,value);

        if(!map.containsKey(key)) { 
            ArrayList<Pair<Integer,String>> list = new ArrayList<>();
            map.put(key,list);
        }
        map.get(key).add(pair);
        
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        ArrayList<Pair<Integer,String>> target = map.get(key);
        int l = 0;
        
        int r = target.size()-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(target.get(mid).getKey() == timestamp) {
                return target.get(mid).getValue();
            }
            if(target.get(mid).getKey() > timestamp) {
                r = mid-1;
            }
            if(target.get(mid).getKey() < timestamp) {
                l = mid+1;
            }


        }
        if(r==-1) return "";
        return target.get(r).getValue();

    }
}
