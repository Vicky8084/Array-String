package SubArray;

import java.util.Scanner;

public class PrintSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limits  :- ");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //condition to print SubArray..!!
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println("]");
            }
        }
    }
}
