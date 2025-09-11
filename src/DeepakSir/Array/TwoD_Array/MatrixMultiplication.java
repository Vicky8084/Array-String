package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Matrix Details :- ");
        System.out.print("Enter limit if Row :- ");
        int r1=sc.nextInt();
        System.out.print("Enter limit of Column :- ");
        int c1= sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                arr1[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Second Matrix Details :- ");
        System.out.print("Enter limit of Row :- ");
        int r2=sc.nextInt();
        System.out.println("Enter limit of Column :- ");
        int c2= sc.nextInt();
        int arr2[][]=new int[r2][c2];
        if(c1==r2){
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                    arr2[i][j]= sc.nextInt();
                }
                System.out.println();
            }

            System.out.println("First Matrix is :- ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Second Matrix is :- ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Multiplication of Two Matrices is :- ");
            int ans[][]=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<r2;k++){
                        ans[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication of this Matrix is not possible because of order is not same...!!!");
        }
    }
}
