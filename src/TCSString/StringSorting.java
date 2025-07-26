package TCSString;

import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str=sc.next();
        int n=str.length();
        String sortValue="";
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)>str.charAt(j)){
                    char temp=str.charAt(i);
                }
            }
        }
    }
}
