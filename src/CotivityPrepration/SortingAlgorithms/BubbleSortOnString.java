package CotivityPrepration.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSortOnString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr= new String[n];
        System.out.println("Enter String Elements .......");
        for(int i = 0; i<n;i++){
            System.out.print("Enter value of ["+i+"]th Index :- ");
            arr[i]=scanner.nextLine();
        }
        System.out.print("String Before Sorting :- ");
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0 ;i<n;i++){
            int flag = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.print("\nString After Sorting :- ");
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
