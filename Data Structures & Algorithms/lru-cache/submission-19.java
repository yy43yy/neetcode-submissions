class LRUCache {
    class Node {
        int val;
        int key;
        Node next;
        Node prev;
        public Node(int key,int value){
        this.val = value;
        this.key = key;
    }
    }
    

    HashMap<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
     

        map = new HashMap<>();
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }


        Node recent = map.get(key);
        if(recent == tail){
            return recent.val;
        }
        if(recent == head){
            head = recent.next;
            head.prev = null;
            tail.next = recent;
            recent.prev = tail;
            tail = recent;
            recent.next=null;
        }else{

        recent.prev.next = recent.next;
        recent.next.prev = recent.prev;

        tail.next = recent;
        recent.prev = tail;
        tail=recent;
        recent.next=null;
        }
        return recent.val;
    }
    
    public void put(int key, int value) {
        Node recent;
        if(map.containsKey(key)){
            recent = map.get(key);
            recent.val = value;

            if(recent == tail){
            
            }else if(recent == head){
                head = recent.next;
                head.prev = null;
                tail.next = recent;
                recent.prev = tail;
                tail = recent;
                recent.next=null;
            }else{

                    recent.prev.next = recent.next;
                    recent.next.prev = recent.prev;

                    tail.next = recent;
                    recent.prev = tail;
                    tail=recent;
                    recent.next=null;
                    }


        }else{
            Node fresh = new Node(key,value);
        
            if(map.size()==0){
                head = fresh;
                tail = fresh;
            } else{
                tail.next = fresh;
                fresh.next = null;
                fresh.prev = tail;
                tail = fresh;
            }
            map.put(key, fresh);

            if(map.size()>capacity){
                int keay = head.key;
                map.remove(keay);

                head = head.next;
                head.prev = null;
            }
        }
    }
}
