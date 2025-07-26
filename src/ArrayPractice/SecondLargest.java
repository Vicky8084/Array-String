package ArrayPractice;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int largest=0,secondLargest=0;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
        }
        else {
            largest=arr[1];
            secondLargest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("\nLargest Element is :- "+largest);
        System.out.println("SecondLargest Element is :- "+secondLargest);
    }
}
