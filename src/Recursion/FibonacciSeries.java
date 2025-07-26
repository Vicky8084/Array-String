package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
//    static int fib(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        return fib(n-1)+fib(n-2);
//    }
    static int helper(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return helper(n-1)+helper(n-2);
    }
    static void fib(int n){
        System.out.println(helper(n));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit to print sum of fibonacci series :- ");
        int n=sc.nextInt();
        //System.out.println("Sum of Fibonaci series :- "+fib(n));
        fib(n);
    }
}
