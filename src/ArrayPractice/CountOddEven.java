package ArrayPractice;

import java.util.Scanner;

public class CountOddEven {
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
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("\nOdd is :- "+odd);
        System.out.println("Even is :- "+even);
    }
}
