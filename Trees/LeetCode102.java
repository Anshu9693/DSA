import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode102 {
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return   result;
          }

          Queue<TreeNode> queue = new LinkedList<>();
          queue.offer(root);
          while(!queue.isEmpty()){
            int lavelSize = queue.size();
            List<Integer> currentLavel = new ArrayList<>();
            for(int i = 0; i<lavelSize;i++){
                TreeNode currTreeNode = queue.poll();
                currentLavel.add(currTreeNode.val);
                if(currTreeNode.left != null){
                    queue.offer(currTreeNode.left);
                }
                if(currTreeNode.right != null){
                    queue.offer(currTreeNode.right);
                }
            }
            result.add(currentLavel);
          }

        return result;
    }
}
