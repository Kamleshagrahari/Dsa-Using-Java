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
    public ListNode deleteMiddle(ListNode head) {
//         if(head==null || head.next==null){
//             return null;
//         }
//         ListNode temp=head;
//         ListNode slow=head;
//         ListNode fast=head;
//         ListNode prev=null;
//         while(fast!=null && fast.next!=null){
//             prev=slow;
//             slow=slow.next;
//             fast=fast.next.next;
//         }

//         prev.next=prev.next.next;
//         return head;
//     }
// }

int count =0;
        ListNode node=head;
        while(node!=null){
            node=node.next;
            count++;
        }
        if(count==1){
            return null;
        }
        node=head;
        for(int i=0;i<(count/2)-1;i++){
            node =node.next;
        }
        node.next=node.next.next;
     return head;
    }
}

        