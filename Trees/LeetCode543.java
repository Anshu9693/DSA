// Definition for a binary tree node (same as LeetCode)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LeetCode543 {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    // returns height of subtree
    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter through current node = left + right
        int dia = leftHeight + rightHeight;

        diameter = Math.max(diameter, dia);

        // Height = 1 + max(left, right)
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Example tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        LeetCode543 obj = new LeetCode543();
        System.out.println(obj.diameterOfBinaryTree(root)); // Output: 3
    }
}
