package dsa.dataStructures.nonLinear.trees.bst;

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
public class BinarySearchTree {
    public static void inOrder(TreeNode root){ // LDR
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // Empty or Root contains the key
        if (root == null || root.data == key){
            return root;
        }
        // The data is either to the left or to the right of root
        if (root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while (curr != null && curr.left != null){
            curr = curr.left; // keep going to the extreme left
        }
        return curr; // This is the leaf node with the least value
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else {
            // Only 1 child
            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            }else if(root.right == null){
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // If there are two children for a given node
            // We find the in-order successor
            // It is the least value of the node's right had side
            // Replace the root with the in-order successor
            // Delete the temporary value at the right
            // We don't take the predecessor because of more restructures
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        System.out.println("InOrder: ");
        inOrder(root);
        System.out.println();
        insert(root, 20);
        insert(root, 40);
        insert(root, 90);
        insert(root,60);
        insert(root,10);
        System.out.println("InOrder: ");
        inOrder(root);
        System.out.println();
        TreeNode result = search(root,90);
        if(result == null){
            System.out.println("Key not found...");
        }else {
            System.out.println("Key found...");
        }
        TreeNode result1 = search(root,900);
        if(result1 == null){
            System.out.println("Key not found...");
        }else {
            System.out.println("Key found...");
        }
        root = deleteNode(root, 50);
        System.out.println("InOrder: ");
        inOrder(root);
        System.out.println();
        System.out.println(root.data);
    }
}
