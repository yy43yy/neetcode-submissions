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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return result;

        queue.addFirst(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 1; i<= queueSize; i++){
                TreeNode temp = queue.pollFirst();
                level.add(temp.val);
                if(temp.left!=null)queue.addLast(temp.left);
                if(temp.right!=null)queue.addLast(temp.right);


            }
            result.addLast(level);

    }

    return result;
    }
}
