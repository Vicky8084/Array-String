package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String to Reverse :- ");
        StringBuffer str = new StringBuffer(sc.nextLine());
        System.out.println("Before reverse :- "+str);
        for(int i=0;i<str.length()/2;i++){
            char ch=str.charAt(i);
            str.setCharAt(i,str.charAt(str.length()-1-i));
            str.setCharAt(str.length()-1-i,ch);
        }
        System.out.println("After reverse :- "+str);
    }
}
