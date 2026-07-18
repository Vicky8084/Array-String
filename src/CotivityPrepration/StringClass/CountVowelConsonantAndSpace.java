package CotivityPrepration.StringClass;

import java.util.Scanner;

public class CountVowelConsonantAndSpace {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any String  to count Vowel, Consonant and Spaces :- ");
        String str = sc.nextLine();
        int consonant=0,vowel=0,space=0,symbol=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                vowel++;
            }else if(ch==' '){
                space++;
            }else if(Character.isLetter(ch)){
                consonant++;
            }else{
                symbol++;
            }
        }
        System.out.print("Consonant :- "+consonant+"\nVowel :- "+vowel+"\nSpace :- "+space);
    }
}
