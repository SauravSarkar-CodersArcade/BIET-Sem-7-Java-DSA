package dsa.dataStructures.nonLinear.trees.problems.lca;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class LowestCommonAncestor {
    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        // Base Case : root is null or root is p or root is q
        if(root == null || root == p || root == q){
            return root;
        }
        // Find the left lca & the right kca recursively
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        // If both the left & right child are non-null, root is lca
        if(left != null && right != null){
            return root;
        }
        // If either left or right is null, return the non-null child
        return (root.left != null) ? root.left : root.right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode node4 = root.left.left;
        TreeNode node5 = root.left.right;
        TreeNode node3 = root.right;

        TreeNode lca1 = lca(root, node4, node5);
        TreeNode lca2 = lca(root, node3, root);

        System.out.println("LCA of 4,5: " + lca1.data);
        System.out.println("LCA of 1,3: " + lca2.data);
    }
}
