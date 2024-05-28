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
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> traversal = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root==null)return traversal;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currList=new ArrayList<>();
            while(size!=0){
                TreeNode tmp= queue.poll();
                currList.add(tmp.val);
                if(tmp.left!=null)queue.add(tmp.left);
                if(tmp.right!=null)queue.add(tmp.right);
                size--;
            }
            traversal.add(currList);
        }return traversal;
    }
}