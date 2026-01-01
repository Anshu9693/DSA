import java.util.Arrays;

public class LeetCode105 {
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }

    int r = preorder[0];
    int index = 0;


    TreeNode node = new TreeNode(r);

    for(int i = 0;i<=inorder.length;i++){
    if(inorder[i]==r){
        index = i;
    }
}
        
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1),Arrays.copyOfRange(inorder,0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length),Arrays.copyOfRange(inorder, index+1, inorder.length));

        return node;

    }
}
