package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n=scanner.nextInt();
        int ans=fibonacci(n);
        if(ans<0){
            System.out.println("No Series..");
        }else {
            System.out.println("Nth element of this series is :- " + ans);
        }
    }
    public static int fibonacci(int n){
        if(n<1){
            return -1;
        }else if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        int x=0,y=1,fib=0;
        for(int i=2;i<n;i++){
            fib=x+y;
            x=y;
            y=fib;
        }
        return fib;
    }
}
/*
Enter Any Number to Print Fibonacci Series :- 18
Series is :- 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597
 */

