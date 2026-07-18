package StackImplementation;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int[][] adjMatrix;
    List<List<Integer>> adjList;
    public Graph(int nodes){
        adjMatrix=new int[nodes][nodes];
        adjList=new ArrayList<>();
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesInList(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int U=edge[0];
            int V=edge[1];
            if(isDirected){
                adjList.get(U).add(V);
            }
            else{
                adjList.get(U).add(V);
                adjList.get(V).add(U);
            }
        }
    }

    public void addEdgesInMatrix(int[][]edges, boolean isDirected){
        for(int[] edge : edges){
            int U=edge[0];
            int V=edge[1];
            if(isDirected) {
                //Directed
                adjMatrix[U][V] = 1;
            }
            else{
                //UnDirected
                adjMatrix[U][V]=1;
                adjMatrix[V][U]=1;
            }
        }
    }

    public void addEdgesWithWeightMatrix(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int U=edge[0];
            int V=edge[1];
            int W=edge[2];
            if(isDirected){
                adjMatrix[U][V]=W;
            }
            else{
                adjMatrix[U][V]=W;
                adjMatrix[V][U]=W;
            }
        }
    }

    public void printMatrix(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("Row "+i+"-> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+",");
            }
            System.out.println();
        }
    }

    public void printList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i +" -> [");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] edges={{0,2},{1,2},{0,3}};
        int nodes=4;
//        Graph graph=new Graph(nodes);
//        graph.addEdgesInMatrix(edges,false);
//        graph.printMatrix();
//        Graph graph=new Graph(nodes);
//        graph.addEdgesWithWeightMatrix(edges,false);
//        graph.printMatrix();

        Graph graph=new Graph(nodes);
        graph.addEdgesInList(edges,false);
        graph.printList();
    }
}
