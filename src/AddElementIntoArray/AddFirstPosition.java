package AddElementIntoArray;

import java.util.Scanner;

public class AddFirstPosition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[100];
        System.out.print("Enter the size of an array :- ");
        int n=sc.nextInt();
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter Element which you want to add int the first position :- ");
        int element=sc.nextInt();
        n++;
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=element;
        System.out.print("after added int the last position Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
