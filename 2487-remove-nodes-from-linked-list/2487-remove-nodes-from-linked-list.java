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


    public ListNode reverse(ListNode head){
        ListNode prev =  null;
        ListNode fwd = null;
        ListNode curr = head;

        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        // ListNode temp = head;
        // Stack<ListNode> st = new Stack<>();

        // while(temp != null){
        //     while(st.size() > 0  && st.peek().val < temp.val) st.pop();
        //     st.push(temp);
        //     temp = temp.next;
        // }

        // while(st.size() > 0){
        //     ListNode top = st.pop();
        //     top.next = temp;
        //     temp = top;
        // }

        // return temp;
        
        ListNode newhead = reverse(head);
        ListNode curr = newhead;

        while(curr != null && curr.next != null){
            if(curr.val > curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return reverse(newhead);




    }
}