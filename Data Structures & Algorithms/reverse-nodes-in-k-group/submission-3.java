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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        //so when we move to k, we perform reverse 
        // so how de we determine whether the second half is >k , we have another pointer move at double speed;
        ListNode curr = head;
        
        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;
       
        while(true){
            ListNode kth = groupPrev;

            for(int i = 0; i<k;i++){
                kth= kth.next;

                if(kth == null){
                    return dummy.next;
                }
            }

            ListNode groupNext = kth.next;
            ListNode groupStart = groupPrev.next;

            ListNode prev = groupNext;
            for(int j= 0; j<k;j++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev= curr;
                curr = temp;
            }

            groupPrev.next = prev;

            groupPrev = groupStart;



        }
        

    }
}
