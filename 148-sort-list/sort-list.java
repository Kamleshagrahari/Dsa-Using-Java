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
    public ListNode sortList(ListNode head) {

        ListNode temp=head;
        ArrayList<Integer> aa=new ArrayList<>();
        while(temp!=null){
            aa.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(aa);
        temp=head;
        for(int i=0;i<aa.size();i++){
            temp.val=aa.get(i);
            temp=temp.next;
        }
        return head;

        
    }
}