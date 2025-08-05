package dsa.dataStructures.nonLinear.trees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTreeBFSTraversal {
    public static void levelOrderTraversal(TreeNode root){
        // If the root is empty, don't traverse
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            // Store the current front node onto a variable
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            // Left Subtree
            if(node.left != null){
                queue.add(node.left);
            }
            // Right Subtree
            if(node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.print("BFS or Level Order Traversal: ");
        levelOrderTraversal(root);
    }
}
