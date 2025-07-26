package Recursion;

import java.util.Scanner;

public class MultipyRecursively {
    public static int multipyRecursively(int n,int m){
        if(m==0){
            return 0;
        }
        int mul=n+multipyRecursively(n,m-1);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Value :- ");
        int n= sc.nextInt();
        System.out.print("Enter Second Value :- ");
        int m=sc.nextInt();
        System.out.println("Multiplication is :- "+multipyRecursively(n,m));;
    }
}
