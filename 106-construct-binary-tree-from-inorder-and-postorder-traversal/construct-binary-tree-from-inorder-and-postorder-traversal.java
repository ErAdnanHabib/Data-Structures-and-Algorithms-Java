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
    Map<Integer,Integer> inorderMap=new HashMap<>();
    int indexPost;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        indexPost=postorder.length-1;
        for(int i=0; i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return tree(postorder , 0 , inorder.length-1);
    }

    public TreeNode tree(int[] postorder , int inStart , int inEnd){
        
        if(inStart>inEnd)return null;

        int rootValue=postorder[indexPost];
        TreeNode root=new TreeNode(rootValue);
        indexPost--;
         
        int inIndex= inorderMap.get(rootValue);
        root.right=tree(postorder,inIndex+1,inEnd);
        root.left=tree(postorder,inStart,inIndex-1);
        
        return root;

    }
}