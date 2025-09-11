package DeepakSir.Array.TwoD_Array;

import java.util.Scanner;

public class Creating2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total Number of row :- ");
        int n=sc.nextInt();
        System.out.print("Enter total Number of Column :- ");
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter ["+i+"th] Row and ["+j+"th] Column value :- ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Elements are :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
