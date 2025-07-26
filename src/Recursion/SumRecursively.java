package Recursion;

import java.util.Scanner;

public class SumRecursively {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" :- is "+sum(n));
    }
}
