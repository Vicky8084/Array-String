package PracticeQuestions.OperationOnString;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean stringPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String :- ");
        String str=sc.next();
        if(stringPalindrome(str)){
            System.out.println("Given String is Palindrome String");
        }
        else{
            System.out.println("Given String is Not Palindrome String");
        }
    }
}
