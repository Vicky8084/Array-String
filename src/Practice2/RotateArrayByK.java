package Practice2;

import java.util.Scanner;

public class RotateArrayByK {
    public static void reverse(int start, int end, int[] arr){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an Array :- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements in the array :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value to Rotate array :- ");
        int k=sc.nextInt();
        k=k%n;

        System.out.print("Before Rotate the Array :-  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nAfter Rotate the Array :-  ");
        reverse(0, n-1, arr);
        reverse(0,k-1,arr);
        reverse(k, n-1, arr);
        for(int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
