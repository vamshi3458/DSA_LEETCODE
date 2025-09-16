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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        boolean ans = binarysearch(list,k);
        return ans;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        preorder(root.left,list);
        list.add(root.val);
        preorder(root.right,list);
    }
    public boolean binarysearch(List<Integer> list,int k){
        int low=0;
        int high=list.size()-1;
        while(low<high){

            int sum=list.get(low)+list.get(high);
            if(sum==k) return true;
            else if(sum>k) high--;
            else
            low++;
        }
        return false;
    }
}