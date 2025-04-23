class TreeNode {
    int data; 
    TreeNode left, right;

    // Constructor to initialize a node
    TreeNode(int value) {
        data = value; 
        left = right = null; 
    }
}

public class G27TreeTraversal {

    // Inorder Traversal method
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left); // Traverse left subtree
        System.out.print(root.data + " "); // Print node data
        inorder(root.right); // Traverse right subtree
    }


// Below is code for testing Above is the logic part. 

    // // Main method to test the inorder traversal
    // public static void main(String[] args) {
    //     // Creating a binary tree
    //     TreeNode root = new TreeNode(1); 
    //     root.left = new TreeNode(2); 
    //     root.right = new TreeNode(3); 
    //     root.left.left = new TreeNode(4);
    //     root.left.right = new TreeNode(5); 
    //     // root.right.left = new TreeNode(6); 
    //     // root.right.right = new TreeNode(7);

    //     // Printing the inorder traversal of the tree
    //     System.out.println("Inorder Traversal:");
    //     inorder(root); }
}