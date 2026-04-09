package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Digits to Reverse it :- ");
        int num=sc.nextInt();
        int rem=0,rev=0;
        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reversed Digit is :- "+rev);
    }

}
