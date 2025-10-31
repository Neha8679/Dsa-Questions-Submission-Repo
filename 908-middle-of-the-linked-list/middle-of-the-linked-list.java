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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int cnt=1;
        ListNode ans=null;
        while(curr!=null){
            curr=curr.next;
            cnt++;


        }
        if(cnt%2!=0){
        for(int j=0;j<(cnt/2);j++){
            ListNode newNode=head.next;
            head.next=ans;
            ans=head;
            head=newNode;
        }
        }
        else{
            for(int j=0;j<(cnt/2)-1;j++){
            ListNode newNode=head.next;
            head.next=ans;
            ans=head;
            head=newNode;

        }}
        return head;
        
    }
}