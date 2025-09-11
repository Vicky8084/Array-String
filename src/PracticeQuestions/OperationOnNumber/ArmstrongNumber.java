package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean armstrongNumber(int n){
        int count=0,cpy=n;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        cpy=n;
        int rem=0,ans=0;
        while (cpy!=0){
            rem=cpy%10;
            ans+= Math.pow(rem,count);
            cpy/=10;
        }
        if(n==ans){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to check armstrong or not :- ");
        int n=sc.nextInt();
        if(armstrongNumber(n)){
            System.out.println("Given Number is Armstrong Number");
        }
        else{
            System.out.println("Given Number is not armstrong Number");
        }
    }
}
