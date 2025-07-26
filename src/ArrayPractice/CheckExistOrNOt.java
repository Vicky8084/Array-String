package ArrayPractice;

import java.util.Scanner;

public class CheckExistOrNOt {
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
        System.out.print("\nEnter Target which we want to check :-");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("The Given target if Exist..!!");
                return;
            }
        }
        System.out.println("Given Target is not Exist...!!");
    }
}
