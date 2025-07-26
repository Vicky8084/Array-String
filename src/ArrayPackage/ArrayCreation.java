package ArrayPackage;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]={1,2,3,4,5,6};
       int arr4[]=new int[]{4,5,6,7,8};
       int arr54[]=new int[7];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]);
        }
        System.out.println();
        for(int i=0;i<arr54.length;i++){
            System.out.print(arr54[i]);
        }
        System.out.println();
        System.out.println("Enter limit of an array :- ");
        int n=sc.nextInt();
        int arr65[]=new int[n];
        System.out.print("Enter elements in the array :- ");
        for(int i=0;i<n;i++){
           arr65[i]=sc.nextInt();
        }
        System.out.println("Elements are :- ");

        for(int i=0;i<n;i++){
            System.out.print(arr65[i]+" ");
        }
        System.out.println("\nusing for each loop");
        for(int i:arr65){
            System.out.print(i+" ");
        }

    }




}
