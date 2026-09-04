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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode t = head;
        int size=0;
        while(t!=null){
            t=t.next;
            size++;
        }
        if(size==0){
            return head;
        }else{
            k=k%size;
        }
        for(int i=0;i<k;i++){
            head =rotate(head );
        }
        return head;
    }
    private ListNode rotate(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
        ListNode b =head;
        ListNode a =b.next;
        while(a.next!=null){
            b=a;
            a=a.next;
        }
        b.next= null;
        a.next=head;
        return a;
    }
}