package Recursion;

import java.util.Scanner;

public class Factorial {
    static int helper(int n){
        if(n==0){
            return 1;
        }
        return n*helper(n-1);
    }
    static void factorial(int n){
        System.out.println(helper(n));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to get their factorial :- ");
        int n=sc.nextInt();
        factorial(n);
    }
}
