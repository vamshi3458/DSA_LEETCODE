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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int num:preorder){
            root = insert(root,num);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int num){
        if(root==null){
            TreeNode nn = new TreeNode(num);
            root=nn;
        }else if(root.val<=num){
            root.right=insert(root.right,num);
        }else{
            root.left=insert(root.left,num);
        }
        return root;
    }
}