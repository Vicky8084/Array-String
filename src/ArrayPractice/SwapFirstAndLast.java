package ArrayPractice;

import java.util.Scanner;

public class SwapFirstAndLast {
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

        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;

        System.out.print("\nElements are :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
