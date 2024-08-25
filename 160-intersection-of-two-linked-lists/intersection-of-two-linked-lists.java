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
        ListNode temp=headA;
        while(temp!=null){
            ListNode curr=headB;
            while(curr!=null){
                if(temp==curr){
                    return curr;
                }else{
                    curr=curr.next;
                }
            }



            temp=temp.next;
        }
        return null;
        
    }
}