package Algorithms.suffix;

import java.util.Scanner;

public class SuffixSum {
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

        int [] sumSuffixArray=new int[n];

        //Time Complexity of This Approach is O(n*n)

//        for(int i=n-1;i>=0;i--){
//            int sumSuffix=0;
//            for(int j=n-1;j>=i;j--){
//                sumSuffix+=arr[j];
//            }
//            sumSuffixArray[i]=sumSuffix;
//        }


        //Time Complexity of This Approach is O(n)

        sumSuffixArray[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sumSuffixArray[i]=sumSuffixArray[i+1]+arr[i];
        }


        System.out.print("\nElements are in the sumSuffixArray :- ");
        for(int i=0;i<n;i++){
            System.out.print(sumSuffixArray[i]+", ");
        }
    }
}
