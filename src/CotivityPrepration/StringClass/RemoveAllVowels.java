package CotivityPrepration.StringClass;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String to Remove all the Vowels :- ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
