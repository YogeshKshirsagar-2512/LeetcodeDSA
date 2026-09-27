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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode length = head;
        int size = 0;



        
        if(head == null || head.next == null) return head;

        while(length != null){
            length = length.next;
            size++;
        }
        k = k % size;
        if(k == 0) return head;

        for(int i = 0; i < k+1; i++){
            if(fast == null) return head;
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        ListNode temp = newHead;
        slow.next = null;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;

        
        }
}