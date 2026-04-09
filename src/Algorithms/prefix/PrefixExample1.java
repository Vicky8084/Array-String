package Algorithms.prefix;

import java.util.Scanner;

/*
    -> You are given an array of size n
    -> Task: Check if the array can be divided into two parts
       such that at a particular index, sum of elements on the left
       is equal to the sum of elements on the right
 */
public class PrefixExample1 {

    public static boolean prefixExample1(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int prefix = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - prefix - arr[i]; // ✅ exclude current element
            if (prefix == rightSum) {
                System.out.println("Equal partition possible at index: " + i);
                return true;
            }
            prefix += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements in the Array :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();

        if (prefixExample1(arr, n)) {
            System.out.println("✅ We can divide the array into two equal-sum parts.");
        } else {
            System.out.println("❌ We can't divide the array into two equal-sum parts.");
        }
    }
}
