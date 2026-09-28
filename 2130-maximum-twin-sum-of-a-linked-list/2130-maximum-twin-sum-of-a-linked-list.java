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
    public int pairSum(ListNode head) {
        if(head.next == null) return head.val;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode newhead = slow.next;
        slow.next = null;

        ListNode forward = null;
        ListNode previous = null;
        ListNode curr = newhead;

        while(curr != null){
            forward = curr.next;
            curr.next = previous;
            previous = curr;
            curr = forward;
        }



        ListNode temp1 = head;
        ListNode temp2 = previous;
        int max_sum = head.val;
        
        while(temp1 != null && temp2 != null){
            if((temp1.val + temp2.val) > max_sum) max_sum = temp1.val + temp2.val;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return max_sum;

    }
}