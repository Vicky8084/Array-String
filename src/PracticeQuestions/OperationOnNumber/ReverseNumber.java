package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static int reveseNumber(int n){
        int rev=0,rem=0;
        while(n!=0){
            rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to reverse it :- ");
        int n=sc.nextInt();
        System.out.println("Reverse is :- "+reveseNumber(n));
    }
}
