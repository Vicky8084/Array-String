package Graph;

public class Graph {
    int adjMatrix[][];
    Graph(int nodes){ //nodes=4
        adjMatrix=new int[nodes][nodes]; //4*4  [0....]
    }
    public void addEdgeInMatrix(int edges[][],boolean isDirected){
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];

            if(isDirected){
                //Directed
                adjMatrix[u][v]=1;
            }
            else{
                //UnDirected
                adjMatrix[u][v]=1;
                adjMatrix[v][u]=1;
            }
        }
    }
    public void printMatrix(){
         for(int i=0;i<adjMatrix.length;i++){
             for(int j=0;j< adjMatrix[i].length;j++){
                 System.out.print(adjMatrix[i][j]+" ");
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
          int edges[][]={{0,2},{0,1},{1,3}};
          int nodes=4;
          Graph graph=new Graph(nodes);
          graph.addEdgeInMatrix(edges,false);
          graph.printMatrix();
    }
}
