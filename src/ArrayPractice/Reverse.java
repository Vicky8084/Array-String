package ArrayPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.print("\nElements are :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
