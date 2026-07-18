package CotivityPrepration.SortingAlgorithms;

import java.util.Scanner;

public class SelectionSortOnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Limit of array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            System.out.print("Enter value of ["+i+"]th Index :- ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Elements before Sorted :- ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n ; i++){
            int min = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("\nElements after Sorted :- ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
