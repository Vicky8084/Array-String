package ArrayPractice;

import java.util.Scanner;

public class PlayingWithTwoArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of first array :- ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter Limit of Second array :- ");
        int n1=sc.nextInt();
        int arr2[]=new int[n1];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n1;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.print("First Array's Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\nSecond Array's Elements are :- ");
        for(int i=0;i<n1;i++){
            System.out.print(arr2[i]+" ");
        }
        arr1[2]=4;
        System.out.print("\nFirst Array's Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\nSecond Array's Elements are :- ");
        for(int i=0;i<n1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
