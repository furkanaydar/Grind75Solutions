package Week2;

public class SymmetricTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean c(TreeNode l, TreeNode r) {
        if (l == null || r == null) {
            return l == null && r == null;
        }

        return l.val == r.val && c(l.right, r.left) && c(l.left, r.right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return c(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    }
}
