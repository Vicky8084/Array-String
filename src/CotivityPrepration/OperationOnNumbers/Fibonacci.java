package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any Number to Print Fibonacci Series :- ");
        int n = scanner.nextInt();
        if(n<1){
            System.out.println("No Series..");
            return;
        }if(n==1){
            System.out.println("0");
            return;
        }
        int a=0,b=1;
        System.out.print("Series is :- "+a+" "+b+" ");
        for(int i=2;i<n;i++){
            int fib = a+b;
            System.out.print(fib+" ");
            a=b;
            b=fib;
        }
    }
}
