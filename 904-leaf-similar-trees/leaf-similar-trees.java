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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        dfs(root1 , str1);
        dfs(root2 , str2);

        return str1.toString().equals(str2.toString());
        
    }

    public void dfs(TreeNode root, StringBuilder str){
        if(root==null)return;
        if(root.left==null && root.right==null){
            str.append(root.val).append(",");
        }
        dfs(root.left , str);
        dfs(root.right ,str);
    }
}