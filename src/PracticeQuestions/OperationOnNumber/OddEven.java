package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class OddEven {
    public static void checkOddEven(int n){
        if(n%2==0){
            System.out.println("Given NUmber is even ....");
        }
        else{
            System.out.println("Given Number is Odd....");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to Check Odd or Even...");
        int n=sc.nextInt();
        checkOddEven(n);
    }
}
