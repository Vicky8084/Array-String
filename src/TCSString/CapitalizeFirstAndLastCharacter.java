package TCSString;

import java.util.Scanner;

public class CapitalizeFirstAndLastCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        String s="";
        s+=Character.toUpperCase(str.charAt(0))+str.substring(1,str.length()-1);
        s+=Character.toUpperCase(str.charAt(str.length()-1));
        System.out.println(s);
    }
}
