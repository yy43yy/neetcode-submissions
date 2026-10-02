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
    public boolean isValidBST(TreeNode root) {
        int result = 0;
        Deque<Helper> stack = new ArrayDeque<>();

        if(root == null) return true;

        stack.addFirst(new Helper(root, null, null));

        
        while(!stack.isEmpty()){
            Helper temp = stack.pollFirst();
            TreeNode curr = temp.node;
            Integer min = temp.min;
            Integer max = temp.max;

            if(min != null && curr.val <= min) return false;
            if(max != null && curr.val >= max) return false;

            if(curr.right!=null) {
                stack.addFirst(new Helper(curr.right,curr.val,max));

            }
            if(curr.left != null) {
                stack.addFirst(new Helper(curr.left,min,curr.val));
                
            }
        }

        return true;

    }
}

public class Helper{
    TreeNode node;
    Integer min;
    Integer max;

    Helper(TreeNode node , Integer min , Integer max){
        this.node = node;
        this.min = min;
        this.max = max;
    }
}
