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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        

        int i = 0;
        int j = 0;

        if(head == null || head.next == null) return head;

        while(fast != null){
            if(slow.val == fast.val){
                fast = fast.next;
            }else{
            slow.next = fast;
            slow = fast;
            }


        }
        slow.next = fast;
        return head;
    }
}