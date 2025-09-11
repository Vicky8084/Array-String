package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.Scanner;

public class ArraySorting {
    public static int[] arraySorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the Array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements before Sorting :- ");
        for(Integer key: arr){
            System.out.print(key+" ");
        }
        arr=arraySorting(arr);
        System.out.print("\nElements After Sorting :- ");
        for(Integer key: arr){
            System.out.print(key+" ");
        }
    }
}
