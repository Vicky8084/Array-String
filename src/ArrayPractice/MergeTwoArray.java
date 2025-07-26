package ArrayPractice;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Limit of First Array :- ");
        int n1=sc.nextInt();
        int []arr1=new int[n1];
        System.out.println("Enter Elements in the first Array :- ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter Limit of Second Array :- ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter Elements in the Second Array :- ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.print("First Array is :- ");
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\nSecond Array is :- ");
        for(int i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
        int n3=n1+n2;
        int arr3[]=new int[n3];
        for(int i=0;i<n1;i++){
            arr3[i]=arr1[i];
        }
        for(int i=n1;i<n3;i++){
            arr3[i]=arr2[i-n1];
        }
        System.out.print("\nMerged Array is :- ");
        for(int i=0;i<n3;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
