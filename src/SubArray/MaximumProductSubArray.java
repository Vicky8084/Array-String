package SubArray;

import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit :- ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int maxPro=Integer.MIN_VALUE;
        int currPro=1;
        for(int i=0;i<n;i++){
            currPro*=arr[i];
            if(maxPro<currPro){
                maxPro=currPro;
            }
            if(currPro<1){
                currPro=1;
            }
        }
        System.out.println("Maximum Product is :- "+maxPro);
    }
}
