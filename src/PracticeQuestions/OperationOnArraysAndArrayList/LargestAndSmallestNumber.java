package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static int[] smallestAndLargestElement(int[] arr){
        //finding smallest Number.........
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //Finding Largest Number.........
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(Integer key:arr){
            System.out.print(key+" ");
        }
        int[] ans=smallestAndLargestElement(arr);
        System.out.print("\nMinimum amd Maximum are consecutively :- ");
        for(Integer key : ans){
            System.out.print(key+", ");
        }
    }
}