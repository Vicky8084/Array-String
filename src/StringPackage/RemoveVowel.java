package StringPackage;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :- ");
        String str=sc.nextLine();
        int n=str.length();
        String resultString="";
        for(int i=0;i<n-1;i++){
            if(!(str.charAt(i)=='a' || str.charAt(i)=='e' ||
                    str.charAt(i)=='i' || str.charAt(i)=='o' ||
                    str.charAt(i)=='u' || str.charAt(i)=='A' ||
                    str.charAt(i)=='E' || str.charAt(i)=='I' ||
                    str.charAt(i)=='O' || str.charAt(i)=='U') ){

                resultString+=str.charAt(i);
            }
        }
        System.out.println("Resulted String :- "+resultString);
    }
}
