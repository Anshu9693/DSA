import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode993 {
 
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lavelSize = queue.size();
            List<Integer> currLavel = new ArrayList<>();
            for(int i =0;i<lavelSize ;i++){
                TreeNode currNode = queue.poll();
                currLavel.add(currNode.val);
                 if(currNode.left !=null){
                queue.offer(currNode.left);
            }
             if(currNode.right !=null){
                queue.offer(currNode.right);
            }
            }
            x=currLavel.get(0) +1;
            y=currLavel.get(currLavel.size()-1);
            
            if(x == y){
                return true;
            }
           
        }
        return false;
    }
}

