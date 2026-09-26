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
    public ListNode deleteMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp  = temp.next;
        }
        if(head.next == null) return null;
        if(size == 2) {
            head.next = null;
            return head;
        }
        
        
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.val = slow.next.val;
        slow.next = slow.next.next;

        return head;
        



        
    }
}