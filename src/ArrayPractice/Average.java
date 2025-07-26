package ArrayPractice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAverage of array is :- "+sum/n);
    }
}
