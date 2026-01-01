import java.util.LinkedList;
import java.util.Queue;

public class LeetCode226 {
     public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            TreeNode temp =   currNode.left;
            currNode.left  = currNode.right;
            currNode.right = temp;

            if(currNode.left != null){
                queue.offer(currNode.left);
            }
            if(currNode.right != null){
                queue.offer(currNode.right);
            }

        }
      return root;
    }
}
