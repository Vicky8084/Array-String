package Sorting;

import java.util.Scanner;

public class BubbleSortInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements before Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.print("\nElements after Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
