package TCSString;

import java.util.Scanner;

public class CountConsonantVowelSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        int n=str.length();
        int vowel=0,space=0,cons=0,total=0;
        for(int i=0;i<n;i++){
            total++;
            char ch=str.charAt(i);
            if(str.charAt(i)==' '){
                space++;
            }
            else if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||
                    ch=='u' || ch=='U' || ch=='o' || ch=='O'){
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Space is :- "+space+"\nConsonant are :- "+cons+"\nVowels are :- "+vowel+"\nTotal are :- "+total);
    }
}
