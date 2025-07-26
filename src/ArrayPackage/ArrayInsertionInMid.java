package ArrayPackage;

import java.util.Scanner;

public class ArrayInsertionInMid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of an Array :- ");
        int n=sc.nextInt();
        int arr[]=new int[100];
        System.out.println("Enter Elements in the Array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\nElements before Insertion :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        char ch;
        do{
            System.out.println("\nEnter Position Where you want to Insert :- ");
            int index=sc.nextInt();
            System.out.print("Enter Elements you want to insert :- ");
            int item=sc.nextInt();
            if(index>0 && index<=n){
                for(int i=n-1;i>=index-1;i--){
                    arr[i+1]=arr[i];
                }
                n++;
                arr[index-1]=item;
                System.out.print("\nElements after Insertion :- ");
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                System.out.println("Position not found");
            }
            System.out.println("\nDo you want to Insert Again (y/n) :- ");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');

    }
}
