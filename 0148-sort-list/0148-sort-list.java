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

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i != null && j != null){
            if(i.val < j.val){ 
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i == null) k.next = j;
        if(j == null) k.next = i;
        return dummy.next;
    }
    public ListNode sortList(ListNode head1) {
        ListNode slow = head1;
        ListNode fast = head1;


        if(head1 == null || head1.next == null) return head1;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head1 = sortList(head1);
        head2 = sortList(head2);

        return merge(head1, head2);



    }
}