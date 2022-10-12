class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = new ListNode(0);
    ListNode h=head;
 
    ListNode p1=list1;
    ListNode p2=list2;
    while(p1!=null && p2!=null){
        if(p1.val < p2.val){
            h.next = p1;
            p1 = p1.next;
        }else{
            h.next = p2;
            p2 = p2.next;
        }
        h=h.next;
    }
 
    if(p1!=null){
        h.next = p1;
    }
 
    if(p2!=null){
        h.next = p2;
    }
 
    return head.next;
}
    }
