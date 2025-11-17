import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode103 {
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        boolean leftToRight = true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int lavelSize = queue.size();
            List<Integer> currLavel = new ArrayList<>();
            for(int i = 0; i<lavelSize ; i++){
                TreeNode currNode = queue.poll();
                currLavel.add(currNode.val);
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            if(!leftToRight){
                Collections.reverse(currLavel);
            }
            result.add(currLavel);
            leftToRight = ! leftToRight;
            
        }

        return result;
        
    }
}
