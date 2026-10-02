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
    public int goodNodes(TreeNode root) {
        //a good node is one that larger than all its ancestors
        int result = 0;
        if(root== null) return result;

        Deque<Helper> queue =  new ArrayDeque<>();

        Helper first = new Helper(root,root.val);

        queue.add(first);

        while(!queue.isEmpty()){
            Helper temp = queue.pollFirst();
            int tempMax = temp.pathMax;
            if(tempMax <= temp.node.val){
                tempMax = temp.node.val;
                result++;
            }

            if(temp.node.right!=null){
                Helper child = new Helper(temp.node.right,tempMax);
                queue.addFirst(child);
            }

            if(temp.node.left!=null){
                Helper child = new Helper(temp.node.left,tempMax);
                queue.addFirst(child);
            }
        } 
         return result;
    }
}
public class Helper {
    TreeNode node;
    int pathMax;

    Helper(TreeNode node, int pathMax){
        this.node = node;
        this.pathMax = pathMax;
    }
}
