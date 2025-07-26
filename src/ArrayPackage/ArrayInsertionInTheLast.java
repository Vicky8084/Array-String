package ArrayPackage;

import java.util.Scanner;

public class ArrayInsertionInTheLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements before insertion :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter elements which you want to insert :- ");
        int item=sc.nextInt();
        n++;
        arr[n-1]=item;
        System.out.println("Elements After insertion :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
