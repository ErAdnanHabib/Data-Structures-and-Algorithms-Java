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
        dfs(root , "" , list);
        return list;
    }
    void dfs(TreeNode node , String path , List<String> list){

        if(node==null)return;

        path += node.val;

        if(node.left==null && node.right==null){
            list.add(path);
        }else{
            path +="->";
            dfs(node.left , path , list);
            dfs(node.right , path , list);
        }
    }
}