package TCSString;

import java.util.Scanner;

public class ASCIIOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :- ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" :- "+(int)str.charAt(i));
        }
    }
}
