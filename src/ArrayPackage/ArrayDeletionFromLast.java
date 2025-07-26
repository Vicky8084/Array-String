package ArrayPackage;

import java.util.Scanner;

// it is only possible when we use another array otherwise it's not possible


public class ArrayDeletionFromLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of an Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        int deletedArray[]=new int[100];
        System.out.println("Enter Elements in the Array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nElements before Deletion  :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        n--;
        System.out.print("\nElements after Deletion  :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n++;
        System.out.print("\nElements after Deletion  :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i=0;i<n-1;i++){
            deletedArray[i]=arr[i];
        }

        System.out.print("\nElements after Deletion  :- ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(deletedArray[i] + " ");
        }
    }
}
