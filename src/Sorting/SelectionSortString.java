package Sorting;

import java.util.Scanner;

public class SelectionSortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.print("Elements before Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        System.out.print("\nElements after Sorted :- ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
