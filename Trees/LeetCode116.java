import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class LeetCode116 {
     public Node connect(Node root) {
        if(root ==null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lavelSize = queue.size();
            Node prev = null;
            for(int i = 0;i<lavelSize ;i++){
                Node currNode = queue.poll();
                if(prev != null){
                    prev.next = currNode;
                }
                prev= currNode;
                
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
        }
        return root;
    }
}
