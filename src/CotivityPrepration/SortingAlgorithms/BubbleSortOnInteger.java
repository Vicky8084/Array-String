package CotivityPrepration.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSortOnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of an Array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in the array :- ");
        for(int i=0;i<n;i++){
            System.out.print("inter value of ["+i+"]th index :- ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Elements are in array before sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++){
            int flag = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.print("\nElements are in array after sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
