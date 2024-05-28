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
    int size=0;
    public int countNodes(TreeNode root) {
        dfs(root);
        if(root==null)return 0;
        return size+1;
    }
    public int dfs(TreeNode root){
        if(root==null)return 0;
        if(root.left!=null){
            dfs(root.left);
            size++;
        }
        if(root.right!=null){
            dfs(root.right);
            size++;
        }
        return size;
    }
}