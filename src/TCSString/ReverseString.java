package TCSString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            s=str.charAt(i)+s;
        }
        System.out.println(s);
    }
}
