package Sorting;

import java.util.Scanner;

public class InsertionSortString {
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
        //5,1,6,2,4,3
        for(int i=1;i<n;i++){
            String temp=arr[i];
            int j=i;
            while (j>0 && arr[j-1].compareTo(temp)>0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }

        System.out.print("\nElements After Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
