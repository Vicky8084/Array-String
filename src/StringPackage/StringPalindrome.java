package StringPackage;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :- ");
        String str=sc.next();
        int n=str.length(),count=0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(str+" is palindrome..!!");
        }
        else{
            System.out.println(str+" is not palindrome..!!");
        }
    }
}
