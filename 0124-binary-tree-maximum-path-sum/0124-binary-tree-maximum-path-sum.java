// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     int helper(TreeNode root){
//         if(root==null){return 0;}
//         int left=helper(root.left);
//         int right = helper(root.right);
//         return Math.max(left,right)+root.val;
//     }


//     public int maxPathSum(TreeNode root) {
//          if (root==null){
//             return 0;
//         }
//         int left=Math.max(helper(root.left),0);
//         int right=Math.max(helper(root.right),0);
//         int curhelper=left+right+root.val;
//         int ls=maxPathSum(root.left);
//         int rs=maxPathSum(root.right);
//         return Math.max(Math.max(ls,rs),curhelper);
        
//     }
// }
class Solution {
    public static int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum=root.val;
        helper(root);
        return maxSum; 
    }
    public static int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMaxSum=Math.max(helper(root.left),0);
        int rightMaxSum=Math.max(helper(root.right),0);
        maxSum=Math.max(maxSum,leftMaxSum+rightMaxSum+root.val);
        return Math.max(leftMaxSum,rightMaxSum)+root.val;
    }
}