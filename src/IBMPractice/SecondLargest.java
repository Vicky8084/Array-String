package IBMPractice;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int smallest=0,secondSmallest=0;
        if(arr[1]>arr[0]){
            smallest=arr[1];
            secondSmallest=arr[0];
        }
        else{
            smallest=arr[0];
            secondSmallest=arr[1];
        }
        for(int i=2;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]<secondSmallest && arr[i]>smallest) {
                secondSmallest=arr[i];
            }
        }
        System.out.println("\nSecond Smallest :- "+secondSmallest+"\nsmallest :- "+smallest);
    }
}
