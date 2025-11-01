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
        ListNode prev=null;
       
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode curr=slow;
        while(curr!=null){
            ListNode newNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNode;
        }
        while(prev!=null){
        if(head.val!=prev.val){
            return false; 
        }
        head=head.next;
        prev=prev.next;
    }
    return true;
        
    }
    
}