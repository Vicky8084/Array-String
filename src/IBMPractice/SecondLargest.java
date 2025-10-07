package IBMPractice;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=0,secondLargest=0;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
        }
        else{
            largest=arr[1];
            secondLargest=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>largest) {
                secondLargest=largest;
                largest = arr[i];
            }
            else if(arr[i]<largest &&  arr[i]>secondLargest ){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest :- "+largest+"\nSecond Largest :- "+secondLargest);

    }
}
