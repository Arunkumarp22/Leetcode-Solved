/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode> q=new LinkedList<>();
          q.offer(root);
        while(!q.isEmpty()){
            Stack<Integer> temp=new Stack<>();
            int count=q.size();
            while(count>0){
            TreeNode curr=q.poll();
            
            temp.push(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
                --count;
            }
            
         li.add(temp.peek());   
        }
        
        return li;
    }
}