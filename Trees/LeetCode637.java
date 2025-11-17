import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
           return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            double averageLavel = 0;
            int laveSize = queue.size();
            for(int i =0;i<laveSize;i++){
                TreeNode currentNode = queue.poll();
                averageLavel += currentNode.val;
                if(currentNode.left !=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right !== null){
                    queue.offer(currentNode.right);
                }
            }

            averageLavel = averageLavel / laveSize;
            result.add(averageLavel);
        }

        return result;
        
    }
}
