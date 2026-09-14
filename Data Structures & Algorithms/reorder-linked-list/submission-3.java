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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //slow is the mid point;
        ListNode l2 = slow.next;

        slow.next = null;

        ListNode l1 = head;

        ListNode prev = null;
        ListNode curr = l2;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next = prev;
            prev= curr;
            curr= temp;
        }

        while(prev != null && l1 !=null){
            ListNode nextL1 = l1.next;
            ListNode nextL2 = prev.next;
            l1.next=prev;
            prev.next = nextL1;
            l1=nextL1;
            prev=nextL2;
            
        }

        
    }
}
