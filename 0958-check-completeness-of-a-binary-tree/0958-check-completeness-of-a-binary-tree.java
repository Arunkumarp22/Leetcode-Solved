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
    public boolean isCompleteTree(TreeNode root) {
        
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        boolean t=false;
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            
            if(n==null){
                t=true;
                continue;
            }
            if(t){
                return false;
            }
            
            q.add(n.left);
            q.add(n.right);
        }
        
        return true;
        
    }
}