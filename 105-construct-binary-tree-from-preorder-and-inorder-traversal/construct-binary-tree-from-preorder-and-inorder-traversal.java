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
    int preOrIndex=0;
    Map<Integer,Integer> inOrderMap=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        return tree(preorder,0,inorder.length-1);
    }

    public TreeNode tree(int[] preorder,int inStart,int inEnd) {
        
        if(inStart>inEnd)return null;

        int rootValue=preorder[preOrIndex];
        TreeNode root=new TreeNode(rootValue);
        preOrIndex++;
        
        int inIndex=inOrderMap.get(rootValue);

        root.left=tree(preorder , inStart, inIndex-1);
        root.right=tree(preorder , inIndex+1 , inEnd);
        return root;
    }
    

    
}