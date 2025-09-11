package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fib(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){

            int x=a+b;
            if(x<=n){
                System.out.print(x+" ");
                a=b;
                b=x;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to print fibonacci Series :- ");
        int n=sc.nextInt();
        fib(n);
    }
}
