class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public int findMin() {
        if (root == null) {
            System.err.println("The tree is empty. Cannot find the minimum value.");
            return -1;
        }

        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        if (root == null) {
            System.err.println("The tree is empty. Cannot find the maximum value.");
            return -1;
        }

        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }

    public double calculateAverage() {
        int totalSum = sumNodesRec(root);
        int totalCount = countNodes();
        if (totalCount > 0) {
            return (double) totalSum / totalCount;
        } else {
            System.err.println("Cannot calculate average for an empty tree.");
            return 0.0;
        }
    }

    private int sumNodesRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumNodesRec(root.left) + sumNodesRec(root.right);
    }
}

public class Mains {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Number of nodes in the BST: " + bst.countNodes());
        System.out.println("Minimum value in the BST: " + bst.findMin());
        System.out.println("Maximum value in the BST: " + bst.findMax());
        System.out.println("Average value of nodes in the BST: " + bst.calculateAverage());
    }
}