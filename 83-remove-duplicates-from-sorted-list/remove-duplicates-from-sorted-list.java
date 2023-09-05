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
    public ListNode deleteDuplicates(ListNode head) {
     ListNode fast=head;
     ListNode slow=head;
     while(fast!=null){
         if(fast.val!=slow.val){
             slow.next=fast;
             slow=fast;
         }
       
         fast=fast.next;
     }
        if(fast==null && slow!=null)
          slow.next=null;
       return head;
     }
    }
