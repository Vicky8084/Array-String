package TCSString;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        String ch="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ch+=str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
