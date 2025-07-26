package Sorting;

import java.util.Scanner;

public class BubbleSortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit of String Array :- ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter String :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.print("String before Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            int flg=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flg++;
                }
            }
            if(flg==0){
                break;
            }
        }
        System.out.print("\nString After Sorted :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
