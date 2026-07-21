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
         ListNode rh=new ListNode(0);
        ListNode res=rh;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                rh.next=list1;
                list1=list1.next;
                rh=rh.next;
            }
            else{
                rh.next=list2;
                list2=list2.next;
                rh=rh.next;
            }
        }
        if(list1!=null){
            rh.next=list1;
        }
        if(list2!=null){
            rh.next=list2;
        }
        return res.next;
    }
}