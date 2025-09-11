package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Matrix Details :- ");
        System.out.print("Enter limit of Row : ");
        int n=sc.nextInt();
        System.out.print("Enter limit of Column :- ");
        int m=sc.nextInt();
        int [][] arr1=new int[n][m];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                arr1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter First Matrix Details :- ");
        System.out.print("Enter limit of Row : ");
        int n1=sc.nextInt();
        System.out.print("Enter limit of Column :- ");
        int m1=sc.nextInt();
        if(n==n1 && m==m1){
            int [][] arr2=new int[n][m];
            System.out.println("Enter Elements :- ");
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                    arr2[i][j]=sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("First Matrix is :- ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Second Matrix is :- ");
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            int sum[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("Sum of Two Matrices are :- ");
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Order of both matrix should be same..!!");
        }

    }
}
