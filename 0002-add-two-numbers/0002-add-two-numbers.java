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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode dummy=res;
        int carry=0,sum=0,lastdigit=0;
        while(l1!=null || l2!=null){
            int l1_val=0,l2_val=0;
            if(l1!=null){
                l1_val=l1.val;
            }else{
                l1_val=0;
            }
            
            if(l2!=null){
                l2_val=l2.val;
            }else{
               l2_val=0; 
            }
            
            
            
            sum=l1_val+l2_val+carry;
            lastdigit=sum%10;
            carry=sum/10;
            
            ListNode nn=new ListNode(lastdigit);
            dummy.next=nn;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            dummy=dummy.next;
        }
        
        if(carry>0){
            ListNode nn=new ListNode(carry);
            dummy.next=nn;
            dummy=dummy.next;
        }
        
        return res.next;
    }
}