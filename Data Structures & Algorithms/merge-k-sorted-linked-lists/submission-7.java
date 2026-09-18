/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(true){
            int min=Integer.MAX_VALUE;
            int index = 0;
            int count = 0;
            for(int i =0 ; i<k ; i++){
                
                if(lists[i] == null) {
                    count++;
                    continue;
                }
                    
                if(min>lists[i].val){
                    min = lists[i].val;
                    index = i;
                }

            }

            if(count==k) break;
            tail.next = lists[index];
            tail = tail.next;
            lists[index] = lists[index].next; 








        }
        return dummy.next;
    }
}
