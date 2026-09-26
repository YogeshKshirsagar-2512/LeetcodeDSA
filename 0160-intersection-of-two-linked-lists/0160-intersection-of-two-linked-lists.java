/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        
        int sizeA = 0;
        int sizeB = 0;


        while(tempA != null){
            tempA = tempA.next;
            sizeA++;
        }

        while(tempB != null){
            tempB = tempB.next;
            sizeB++;
        }

        int k = sizeA - sizeB;
        tempA = headA;
        tempB = headB;
        if(k < 0){
            for(int i = 0 ; i < -k ; i++){
                tempB = tempB.next;
            }
        }else{
            for(int i = 0 ; i < k ; i++){
                tempA = tempA.next;
            }
        } 

        while(tempA != null && tempB != null){
            if(tempA == tempB) break;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
   
    


        

    }
}