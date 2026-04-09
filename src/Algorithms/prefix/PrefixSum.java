package Algorithms.prefix;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int []arr =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are in the Array :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }

        int [] sumPrefixArray=new int[n];

        //Time Complexity of This Approach is O(n*n)

//        for(int i=0;i<n;i++){
//            int sumPrefix=0;
//            for(int j=0;j<=i;j++){
//                sumPrefix+=arr[j];
//            }
//            sumPrefixArray[i]=sumPrefix;
//        }

        //Time Complexity of This Approach is O(n)

        sumPrefixArray[0]=arr[0];
        for(int i=1;i<n;i++){
            sumPrefixArray[i]=sumPrefixArray[i-1]+arr[i];
        }

        System.out.print("\nElements are in the sumPrefixArray :- ");
        for(int i=0;i<n;i++){
            System.out.print(sumPrefixArray[i]+", ");
        }
    }
}
