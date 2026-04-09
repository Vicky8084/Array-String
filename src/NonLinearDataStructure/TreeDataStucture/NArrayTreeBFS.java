package NonLinearDataStructure.TreeDataStucture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class NArrayTreeNode<E>{
    E data;
    ArrayList<NArrayTreeNode> children;
    public NArrayTreeNode(E data){
        this.data=data;
        children=new ArrayList<>();
    }
}
public class NArrayTreeBFS {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> BFS(NArrayTreeNode<Integer> root){
        ArrayList<Integer> res=new ArrayList<>();
        Queue<NArrayTreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            NArrayTreeNode<Integer> node=queue.poll();

        }
        return res;
    }
}
