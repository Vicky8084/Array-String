package PracticeQuestions.OperationOnArraysAndArrayList;

import java.util.Scanner;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Element :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(Integer key : arr){
            System.out.print(key+" ");
        }
        int k=n+1;
        int ans=(k*(k+1))/2,sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("\nMissing element is :- "+(ans-sum));
    }
}
