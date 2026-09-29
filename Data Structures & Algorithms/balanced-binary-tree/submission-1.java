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
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return result;
    }

    public int height(TreeNode node){
        if(node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);

        if(lh-rh >1 || rh-lh >1) result = false;

        return Math.max(lh,rh)+1;
    }
}
