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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(2);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp = head;
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        int index = 1;
        while(temp != null){
            if(index % 2 != 0){
                temp1.next = temp;
                temp1 = temp;
            }else{
                temp2.next = temp;
                temp2 = temp;
            }
            temp = temp.next;
            index++;
        }
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy1.next;
    }
}