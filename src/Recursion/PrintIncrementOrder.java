package Recursion;

import java.util.Scanner;

public class PrintIncrementOrder {
//    public static void printIncrementOrder(int n,int i){
//        if(i>n){
//            return;
//        }
//        System.out.print(i+" ");
//        printIncrementOrder(n,i+1);
//    }

    public static void printIncrementOrder(int n){
        if(n==0){
            return;
        }
        printIncrementOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        //printIncrementOrder(n,1);
        printIncrementOrder(n);
    }
}
