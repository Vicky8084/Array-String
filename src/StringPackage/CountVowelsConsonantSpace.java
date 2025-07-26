package StringPackage;

import java.util.Scanner;

public class CountVowelsConsonantSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        int n=str.length(),vowel=0,space=0,consonant=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                space++;
            }
            else if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
                    str.charAt(i)=='i' || str.charAt(i)=='o' ||
                    str.charAt(i)=='u' || str.charAt(i)=='A' ||
                    str.charAt(i)=='E' || str.charAt(i)=='I' ||
                    str.charAt(i)=='O' || str.charAt(i)=='U'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Consonant is :- "+consonant+" Vowel is :- "+vowel+" space is :- "+space);
    }
}
