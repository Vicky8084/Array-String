package SubArray;

import java.util.Scanner;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in teh array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are in the array are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int maxSum=Integer.MIN_VALUE, currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("\nMaximum sum is :- "+maxSum);
    }
}
