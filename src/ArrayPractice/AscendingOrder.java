package ArrayPractice;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit of an Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                    if(arr[i]>arr[j+1]){
                        int temp=arr[i];
                        arr[i]=arr[j+1];
                        arr[j+1]=temp;
                    }
            }
        }
        System.out.print("\nElements are :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
