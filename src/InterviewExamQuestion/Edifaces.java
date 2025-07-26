package InterviewExamQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Edifaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit of array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Value :- ");
        int k=sc.nextInt();
        System.out.println("Size of Array :- "+n);
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Value which multiply :- ");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i++) {
            int sum=0;
            sum=arr[i]+arr[i+1];
            list.add(k*sum);
        }
        int min=list.get(0);
        for(int i=0;i<n;i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println("Smallest Value is :- "+min);
    }

}
