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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root , sb , list);
        return list;
    }
    void dfs(TreeNode node , StringBuilder sb , List<String> list){

        if(node==null)return;
        int len =sb.length();

        sb.append(node.val);

        if(node.left==null && node.right==null){
            list.add(sb.toString());
        }
        sb.append("->");
        dfs(node.left , sb , list);
        dfs(node.right , sb , list);
        sb.setLength(len);
    }
}