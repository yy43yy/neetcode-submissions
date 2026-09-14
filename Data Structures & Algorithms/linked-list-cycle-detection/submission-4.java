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
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        int count = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(slow == fast) break;
        }

        if(fast == null || fast.next == null) return false;

        ListNode temp = head;
        int res = 0;
        while(temp != slow){
            temp= temp.next;
            slow=slow.next;
            res++;
        }

        return true;

    }
}
