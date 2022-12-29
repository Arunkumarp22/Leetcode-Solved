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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null) return li;
        int flag=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> temp=new ArrayList<>();
            while(count>0){
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                 if(curr.right!=null) q.add(curr.right);
                --count;
            }
            if(flag==0){
                li.add(temp);
                flag=1;
            }else{
                Collections.reverse(temp);
                li.add(temp);
                flag=0;
            }
        }
        
        return li;
    }
}