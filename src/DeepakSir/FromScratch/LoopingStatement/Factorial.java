package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int n){
        if(n==1){
            return 1;
        }

        return n*factorial(n-1);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number to Calculate it's Factorial :- ");
        int n=sc.nextInt();
        //long fact=1;
//        for(int i=1;i<=n;i++){
//            fact*=i;
//        }
        System.out.println("factorial of "+n+" is :- "+factorial(n));
    }
}
