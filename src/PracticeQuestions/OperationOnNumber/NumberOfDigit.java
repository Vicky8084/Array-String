package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class NumberOfDigit {
    public static int countDigit(int n){
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to Count the digit :-");
        int n=sc.nextInt();
        System.out.print("Total number is :- "+countDigit(n));
    }
}
