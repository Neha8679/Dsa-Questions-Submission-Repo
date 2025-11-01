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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        if(head==null){
            return null;
        }
       
        ListNode curr=head;
        int cnt=0;
        while(curr!=null){
            cnt++;
            curr=curr.next;
        }
        ListNode prevendNode=dummy;
        int x=cnt/k;
        while(cnt>=k){
            ListNode prev=null;
            ListNode currHead=prevendNode.next;
            ListNode currNode=currHead;
         
            for(int i=0;i<k;i++){
                ListNode newNode=currNode.next;
                currNode.next=prev;
                prev=currNode;
                currNode=newNode;
                
            }
            prevendNode.next=prev;
            currHead.next=currNode;
            
           prevendNode=currHead;
           cnt=cnt-k;
        }
        return dummy.next;



        
    }
}