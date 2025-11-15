public class SegmentTrees {

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTrees tree = new SegmentTrees(arr);
        tree.display();

        System.out.println("Query(2,5): " + tree.quary(2,5));
        tree.update(3,10);
        tree.display();
    }

    public static class Node {
        int data;
        int statInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int statInterval, int endInterval) {
            this.statInterval = statInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTrees(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "intervel=[" + node.left.statInterval + "-" + node.left.endInterval + "] and data=" + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // FIXED: Current node must use node (not node.left)
        str = str + "intervel=[" + node.statInterval + "-" + node.endInterval + "] and data=" + node.data + " <= ";

        if (node.right != null) {
            str = str + "intervel=[" + node.right.statInterval + "-" + node.right.endInterval + "] and data=" + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    // Query
    public int quary(int qsi, int qei) {
        return this.quary(this.root, qsi, qei);
    }

    private int quary(Node node, int qsi, int qei) {

        // FIXED: No overlap condition
        if (node.endInterval < qsi || node.statInterval > qei) {
            return 0;
        }

        // Fully inside
        if (node.statInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // Partial overlap
        return this.quary(node.left, qsi, qei) + this.quary(node.right, qsi, qei);
    }

    // Update
    public void update(int index, int val) {
        this.root.data = update(this.root, index, val);
    }

    private int update(Node node, int index, int val) {

        // Leaf node
        if (node.statInterval == node.endInterval) {
            if (node.statInterval == index) {
                node.data = val; // FIXED (update value)
            }
            return node.data;
        }

        int mid = (node.statInterval + node.endInterval) / 2;

        if (index <= mid) {
            update(node.left, index, val);
        } else {
            update(node.right, index, val);
        }

        node.data = node.left.data + node.right.data;
        return node.data;
    }
}
