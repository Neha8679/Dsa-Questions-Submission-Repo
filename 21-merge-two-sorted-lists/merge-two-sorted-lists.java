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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        int m=0;
        int n=0;
        while(curr1!=null){
            m++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            n++;
            curr2=curr2.next;
        }
        int[] arr=new int[m+n];
        ListNode dummy =new ListNode(0);
        ListNode curr=dummy;

        for(int i=0;i<m+n;i++){
            if(i<m){
                arr[i]=list1.val;
                list1=list1.next;
            }
            else{
                arr[i]=list2.val;
                list2=list2.next;
            }

        }
        Arrays.sort(arr);
        for(int i=0;i<m+n;i++){
            if(i<m){
                ListNode newNode=new ListNode(arr[i]);
                curr.next=newNode;
                curr=curr.next;

            }
            else{
                ListNode newNode2=new ListNode(arr[i]);
                curr.next=newNode2;
                curr=curr.next;
            }
        }
        return dummy.next;
        
    }
}