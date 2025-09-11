package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        int sum=0,rem=0;
        while (n!=0){
            rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int n=sc.nextInt();
        System.out.println("The Sum of Digits are :- "+sumOfDigit(n));
    }

}
