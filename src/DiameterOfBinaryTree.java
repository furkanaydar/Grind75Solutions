public class DiameterOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int result = Integer.MIN_VALUE;

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);
        int s = 0;

        if (root.left != null) {
            s+=l;
        }

        if (root.right != null) {
            s+=r;
        }

        result = Math.max(result, s);
        return Math.max(l, r) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

}
