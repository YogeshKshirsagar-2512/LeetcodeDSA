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
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head1;
        ListNode j = head2;

        while(i !=  null && j != null){
            if(i.val < j.val){
                temp.next = i;
                i = i.next;
            }else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }
        if(i == null) temp.next = j;
        if(j == null) temp.next = i;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(int i = 0 ; i < lists.length ; i++) {
            arr.add(lists[i]);
        }
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
        }

        return arr.get(0);


        
    }
}