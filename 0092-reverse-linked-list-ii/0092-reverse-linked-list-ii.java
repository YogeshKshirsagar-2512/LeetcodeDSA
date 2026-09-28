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
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = node;

        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        if(left == right) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left_node = dummy;
        ListNode right_node = dummy;

        for(int i = 0; i < right; i++){
            if(i<left-1){
                left_node = left_node.next;
            }
            right_node = right_node.next;
        }

        ListNode left_next = left_node.next;
        left_node.next = null;
        ListNode right_next = right_node.next;
        right_node.next = null;
        ListNode newhead = reverse(left_next);
        left_node.next =  newhead;
        left_next.next = right_next;
        return dummy.next;




        


        

    }
}