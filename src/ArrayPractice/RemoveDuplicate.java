package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
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
        Arrays.sort(arr);
        System.out.print("\nElements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                for(int k=i;k<n-1;k++){
                    arr[k]=arr[k+1];
                }
                i--;
                n--;
            }
        }
        System.out.print("\nAfter Duplicate Removed :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
