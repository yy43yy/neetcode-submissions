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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int large = Math.max(p.val,q.val);
        int small = Math.min(p.val,q.val);

        if(root.val>large){
            return lowestCommonAncestor(root.left,p,q);
        }

        if(root.val<small){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
