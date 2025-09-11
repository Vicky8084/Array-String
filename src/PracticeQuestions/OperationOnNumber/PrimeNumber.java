package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number to Check prime or Not :- ");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Not prime number");
            return;
        }
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
