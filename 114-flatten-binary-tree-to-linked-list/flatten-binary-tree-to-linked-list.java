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
    public void flatten(TreeNode root) {
        if(root==null)return;

        TreeNode lefty = root.left;
        TreeNode righty = root.right;

        root.left = null;

        flatten(lefty);
        flatten(righty);

        root.right = lefty;

        TreeNode curr = root;
        while(curr.right != null)curr=curr.right;
        curr.right = righty;
    }
}