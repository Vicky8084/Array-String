package Recursion;

import java.util.Scanner;

public class PrintNameNTime {
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("VICKY");
        printName(n-1);
        System.out.println("Gupta");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limits to print 'VICKY' how many times :- ");
        int n=sc.nextInt();
        printName(n);
    }
}
