package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swapTwoNumbers(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("First Number is :- "+num1+"\nSecond Number is :- "+num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number :- ");
        int num2=sc.nextInt();
        swapTwoNumbers(num1,num2);
    }
}
