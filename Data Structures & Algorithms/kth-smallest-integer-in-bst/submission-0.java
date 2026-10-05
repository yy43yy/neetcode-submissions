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
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int result = 0;
        if(root==null) return result;
        TreeNode current = root;
        

        while(!stack.isEmpty()|| current != null){
                while(current!=null){
                    stack.addFirst(current);
                    current = current.left;
                }

                result++;
                TreeNode temp = stack.pollFirst();
                if(result == k) return temp.val;
                current = temp.right;
        }

        return 0;
    }
}
