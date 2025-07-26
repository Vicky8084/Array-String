package Recursion;

import java.util.Scanner;

public class RecursivelyPrintNumbersInReverse {
    public static void recursivelyPrintNumbersInReverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursivelyPrintNumbersInReverse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limits :- ");
        int n=sc.nextInt();
        recursivelyPrintNumbersInReverse(n);
    }
}
