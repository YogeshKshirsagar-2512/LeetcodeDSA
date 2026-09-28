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
    public boolean isPalindrome(ListNode head) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }

        // int i = 0;
        // int j = arr.size()-1;
        // while(i < j){
        //     if(arr.get(i) != arr.get(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        ListNode slow = head;
        ListNode fast = head;
        

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode newhead = slow.next;
        slow.next = null;

        ListNode previous = null;
        ListNode forward = null;
        ListNode curr = newhead;

        while(curr != null){
            forward = curr.next;
            curr.next = previous;
            previous  = curr;
            curr = forward;
        }

        ListNode temp1 = head;
        ListNode temp2 = previous;

        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

    }
}