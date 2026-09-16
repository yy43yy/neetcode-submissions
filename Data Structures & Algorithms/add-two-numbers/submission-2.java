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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        int carry=0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(one != null || two != null || carry !=0){
            if(one == null) one = new ListNode(0);
            if(two == null) two = new ListNode(0);
            int value = one.val + two.val + carry;
            if(carry==1)carry--;

            if(value>=10){
                value-=10;
                carry++;

            }
            curr.next = new ListNode(value);
            curr= curr.next;
            one=one.next;
            two=two.next; 
             
        }
        return dummy.next;

    }
}
