package Sorting;

import java.util.Scanner;

public class FloorInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array in Sorting order :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter Value to Search :- ");
        int x=sc.nextInt();
        //Linear Search...!!!
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                continue;
            }
            System.out.println("The Index is :- "+(i-1));
            break;
        }
    }
}
