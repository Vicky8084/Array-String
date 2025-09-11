package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static boolean isPrimeNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number to Check Prime or Not....");
        int n=sc.nextInt();
        if(isPrimeNumber(n)){
            System.out.println("Given Number is prime Number...");
        }
        else {
            System.out.println("Given Number is not prime number....");
        }
    }
}
