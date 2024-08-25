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
    //    BRUTEFORCE
        // ListNode temp=headA;
        // while(temp!=null){
        //     ListNode curr=headB;
        //     while(curr!=null){
        //         if(temp==curr){
        //             return curr;
        //         }else{
        //             curr=curr.next;
        //         }
        //     }



        //     temp=temp.next;
        // }
        // return null;

        // HASHSET
        HashSet<ListNode> hs=new HashSet<>();
        
        while(headA!=null){
            hs.add(headA);
            headA=headA.next;

        }
        ListNode temp=headB;
        while(temp!=null){
            if(hs.contains(temp)){
                return temp;
            }else{
                temp=temp.next;
            }
        }
        return null;
        
    }
}