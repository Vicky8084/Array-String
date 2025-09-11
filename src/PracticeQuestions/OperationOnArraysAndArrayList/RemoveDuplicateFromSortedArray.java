package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static int [] removeDuplicateFromSortedArray(int[] arr){
        if(arr.length==0){
            return arr;
        }
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                    j++;
                    arr[j]=arr[i];
            }
        }
        int[]result=new int[j+1];
        for(int i=0;i<=j;i++){
            result[i]=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements before removed duplicate :- ");
        for(Integer key:arr){
            System.out.print(key+" ");
        }
        int[] ans =removeDuplicateFromSortedArray(arr);
        System.out.print("\nElements after removed duplicate :- ");
        for(Integer key:ans){
            System.out.print(key+" ");
        }
    }

}


