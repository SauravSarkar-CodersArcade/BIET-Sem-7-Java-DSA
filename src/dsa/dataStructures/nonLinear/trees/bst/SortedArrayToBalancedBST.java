package dsa.dataStructures.nonLinear.trees.bst;
class TNode {
    int data;
    TNode left;
    TNode right;
    TNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class SortedArrayToBalancedBST {
    public static TNode sortedArrayToBalancedBST(int[] arr, int s, int e){
        if(s > e){
            return null;
        }
        int mid = s + (e-s)/2;
        // Make the mid-value the root node of the tree
        TNode root = new TNode(arr[mid]);
        // recursion for the left subtree
        root.left = sortedArrayToBalancedBST(arr, s, mid-1);
        // recursion for the right subtree
        root.right = sortedArrayToBalancedBST(arr, mid+1, e);
        return root;
    }
    public static void inOrder(TNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TNode root = sortedArrayToBalancedBST(arr, 0, arr.length-1);
        System.out.print("InOrder Traversal of the BST: ");
        inOrder(root);
        System.out.println();
    }
}
