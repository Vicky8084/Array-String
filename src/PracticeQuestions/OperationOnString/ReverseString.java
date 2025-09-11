package PracticeQuestions.OperationOnString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str= sc.next();
        String revStr="";
        for(int i=0;i<str.length();i++){
            revStr += str.charAt(str.length()-i-1);
        }
        System.out.println(revStr);
    }
}
