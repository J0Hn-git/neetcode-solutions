class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        
        if(Math.abs(left - right) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
