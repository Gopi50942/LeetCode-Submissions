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
    int height(TreeNode root){
        if(root==null){return 0;}
        return Math.max(height(root.left),height(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int curheight=left+right;
        int ls=diameterOfBinaryTree(root.left);
        int rs=diameterOfBinaryTree(root.right);
        return Math.max(Math.max(ls,rs),curheight);

    }
}
