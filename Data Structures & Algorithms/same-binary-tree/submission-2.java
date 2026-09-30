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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p,q);
        return result;
    }

    public void check(TreeNode p, TreeNode q){
        if(p == null && q == null) return;
        if(p !=null && q!=null && p.val == q.val){
            check(p.left, q.left);
            check(p.right, q.right);
            return;
        }else{
            result = false;
            return;
        }
        

        


    }

}
