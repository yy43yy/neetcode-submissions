/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();

        Node curr = head;

        while(curr != null){
            Node copy = new Node(curr.val);
            map.put(curr,copy);
            curr= curr.next;
        }
        
        Node dummy = new Node(0);
        Node temp = head;
        Node fresh = dummy;

        while(temp!=null){
            fresh.next = map.get(temp);
            
            fresh=fresh.next;
            fresh.random = map.get(temp.random);
            temp=temp.next;
            
        }

        return dummy.next;





    }
}
