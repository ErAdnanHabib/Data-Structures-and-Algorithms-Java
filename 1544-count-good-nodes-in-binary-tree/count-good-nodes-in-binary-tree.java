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
       return dfs(root , root.val);
    }
    public int dfs(TreeNode root , int max){
        if(root==null)return 0;
        int count=0;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        return count + dfs(root.left , max) + dfs(root.right , max);

    }
}
