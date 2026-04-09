package NonLinearDataStructure.TreeDataStucture;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;
    public TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class TreeBFS {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> BFS(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return res;
    }
}
