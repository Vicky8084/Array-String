package Strings;

import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to Check Palindrome or not :- ");
        StringBuffer sb=new StringBuffer(sc.nextLine());
//        StringBuffer sb2=new StringBuffer(sb);
        int n=sb.length();

        int count=0;
        for(int i=0;i<n/2;i++){
            if(sb.charAt(i)!=sb.charAt(n-1-i)) {
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Given String is Palindrome...!!!");
        }
        else{
            System.out.println("Given String is not Palindrome...!!!");
        }

//        for(int i=0;i<n/2;i++){
//            if(sb.charAt(i)!=sb.charAt(n-1-i)){
//                System.out.println("Not Palindrome");
//                return;
//            }
//        }
//        System.out.println("Given String is Palindrome");

//        for(int i=0;i<n/2;i++){
//            char ch=sb.charAt(i);
//            sb.setCharAt(i,sb.charAt(n-1-i));
//            sb.setCharAt(n-1-i,ch);
//        }
//        System.out.println(sb);
//        System.out.println(sb2);
//        if(sb2.toString().equals(sb.toString())){
//            System.out.println("Given String is Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
    }
}
