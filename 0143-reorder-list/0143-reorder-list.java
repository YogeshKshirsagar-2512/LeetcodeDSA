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

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newhead = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr =  newhead;

        while(curr != null){
            fwd =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        ListNode temp1 = head;
        ListNode temp2 = prev;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int index = 1;

        while(temp1 != null || temp2 != null){
            if(index % 2 != 0){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
            index++;
        }


   



        
    }
}