package ArrayPractice;

import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are Before Copied :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        System.out.print("\nElements are After Copied :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");

        }

    }
}

