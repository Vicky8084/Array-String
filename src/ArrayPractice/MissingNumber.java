package ArrayPractice;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limits :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the array(0 to n) :- ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nThe Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int totalSum=n*(n+1)/2;
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
        }
        System.out.println("\nThe Missing Number is :- "+(totalSum-currentSum));
    }
}
