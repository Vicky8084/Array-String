package TCSString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.next();
        int n=str.length();
        int count=0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("Given String is not Palindrome..");
        }
        else{
            System.out.println("Given String is Palindrome..");
        }
    }
}
