package Strings;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String Paragraph to count Words :- ");
        String str=sc.nextLine().trim();
        int count=0;
        if(str.isEmpty()){
            System.out.println("Total Number of Words are :- 0");
            return;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') {
                count++;
            }
        }
        System.out.println("Total number of words are :- "+(count+1));
    }
}
