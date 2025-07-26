package Recursion;

import java.util.Scanner;

public class PrintStar {
    static void helper(int x){
        if(x==0){
            return;
        }
        System.out.print("* ");
        helper(x-1);
    }
    static void printStar(int n){
        if(n==0){
            return;
        }
        printStar(n-1);
        helper(n);
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printStar(n);

    }
}
