class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTraversal {
    // In-order traversal: Left -> Root -> Right
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }
    
    // Pre-order traversal: Root -> Left -> Right
    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    // Post-order traversal: Left -> Right -> Root
    public static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }
    
    public static void main(String[] args) {
        // Create a sample binary tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("In-order traversal:");
        inOrderTraversal(root);
        
        System.out.println("\nPre-order traversal:");
        preOrderTraversal(root);
        
        System.out.println("\nPost-order traversal:");
        postOrderTraversal(root);
    }
}