package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+", "+b+", ");
        for(int i=2;i<n;i++){
            int x=a+b;
            if(x<=n){
                System.out.print(x+", ");
                a=b;
                b=x;
            }
        }
    }
}
