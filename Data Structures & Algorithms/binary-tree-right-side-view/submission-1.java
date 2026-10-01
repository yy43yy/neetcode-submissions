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
        
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while(!queue.isEmpty()){

            
            TreeNode top =  queue.peekFirst();
            result.add(top.val);

            int queueSize = queue.size();
            for(int i = 1; i<=queueSize;i++){
                TreeNode temp = queue.pollFirst();
                if(temp.right!=null){
                    queue.addLast(temp.right);
                }
                if(temp.left!=null){
                    queue.addLast(temp.left);
                }
                
            }
        }

        return result;

    }
}
