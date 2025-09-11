package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class printMatrix {
    public static void printMatrixRowWise(int[][]mat,int r,int c){
        System.out.println("The Matrix is Row Wise :- ");
        for(int i=0;i<r;i++){
            System.out.print(i+1+"th Row :- ");
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printMatrixColumnWise(int[][]mat,int r,int c){
        System.out.println("\nThe Matrix is Row Wise :- ");
        for(int j=0;j<c;j++){
            System.out.print(j+1+"th Column :- ");
            for(int i=0;i<r;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Row :- ");
        int r=sc.nextInt();
        System.out.print("Enter limit of column :- ");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                mat[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original Matrix is :- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
//        printMatrixRowWise(mat,r,c);
        printMatrixColumnWise(mat,r,c);
    }
}
