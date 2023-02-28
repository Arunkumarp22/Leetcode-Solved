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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res=new LinkedList<>();
        helper(root,new HashMap<>(),res);
        return res;
    }
    
    public String helper(TreeNode curr,Map<String,Integer> map,List<TreeNode> res) {
        if(curr==null) return "#";
        String tree =  curr.val+","+helper(curr.left,map,res)+","+helper(curr.right,map,res);
        map.put(tree, map.getOrDefault(tree, 0) + 1);
        if (map.get(tree) == 2) res.add(curr);
        return tree;
    }
}