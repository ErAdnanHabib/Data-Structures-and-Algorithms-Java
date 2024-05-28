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
    int maxx=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxx; 
    }
    public int dfs(TreeNode root) {
        if(root==null)return 0;
        int leftMax=Math.max(0,dfs(root.left));
        int rightMax=Math.max(0,dfs(root.right));
        maxx=Math.max(maxx,root.val+ leftMax + rightMax);
        return root.val + Math.max(leftMax , rightMax);
    }

}