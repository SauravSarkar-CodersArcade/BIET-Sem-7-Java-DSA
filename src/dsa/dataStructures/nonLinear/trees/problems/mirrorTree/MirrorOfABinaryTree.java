package dsa.dataStructures.nonLinear.trees.problems.mirrorTree;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class MirrorOfABinaryTree {
    public static TreeNode mirrorTree(TreeNode root){
        if(root == null){
            return null;
        }
        // Take a temporary node variable to swap the left & right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recursively swap the left & right subtrees
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
        return root;
    }
    public static void inOrder(TreeNode root){ // LDR
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.print("InOrder of Original Tree: ");
        inOrder(root);
        System.out.println();
        root = mirrorTree(root);
        System.out.print("InOrder of Mirror Tree: ");
        inOrder(root);
        System.out.println();
    }
}
