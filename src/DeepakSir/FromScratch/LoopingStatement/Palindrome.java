package DeepakSir.FromScratch.LoopingStatement;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Digit to check Palindrome or not :- ");
        int n=sc.nextInt();
        int cpy=n,rem=0,rev=0;
        while(cpy>0){
            rem=cpy%10;
            rev=rev*10+rem;
            cpy/=10;
        }
        if(rev==n) System.out.println("Given Digit "+n+" is Palindrome");
        else System.out.println("Given Digit "+n+" is not Palindrome");
    }
}
