package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {

        //................... Sum of Elements ........................

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Row :- ");
        int n= sc.nextInt();
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
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr1[i][j];
            }
        }
        System.out.println("Elements are :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of all the elements are :- "+sum);
    }
}
