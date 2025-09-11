package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int rev=0,rem=0,cpy=n;
        while (cpy!=0){
            rem=cpy%10;
            cpy/=10;
            rev=rev*10+rem;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Given Number is Palindrome Number");
        }
        else{
            System.out.println("Given Number is not Palindrome Number");
        }
    }
}
