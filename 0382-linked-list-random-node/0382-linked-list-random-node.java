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
    int len=0;
    ListNode he;
    public Solution(ListNode head) {
        he=head;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        Random random=new Random();
        int rand_index=random.nextInt(len);
        ListNode temp=he;
        for(int i=0;i<rand_index;i++){
            temp=temp.next;
        }
        
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */