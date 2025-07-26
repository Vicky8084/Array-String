package TCSString;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||
                    ch=='u' || ch=='U' || ch=='o' || ch=='O')){
                s+=ch;
            }
        }
        System.out.println(s);
    }
}
