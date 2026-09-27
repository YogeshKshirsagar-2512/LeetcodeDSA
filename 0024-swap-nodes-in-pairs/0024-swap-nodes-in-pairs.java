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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp = head;
        int index = 1;
        if(head == null || head.next == null) return head;
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
        temp1.next = null;

        ListNode dummy3 = new ListNode(-1);
        ListNode i = dummy1.next;
        ListNode j = dummy2.next;
        ListNode k = dummy3;
        index = 1;

        while(i != null && j != null){
            if(index % 2 == 0){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
            index++;
        }

        if(i == null) k.next = j;
        if(j == null) k.next = i;
        return dummy3.next;




   



        



    }
}