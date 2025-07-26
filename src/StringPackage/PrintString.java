package StringPackage;

import java.math.BigInteger;
import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to Print :- ");
        String str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(i)+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(str.charAt(i)==str.charAt(j+1)){

                }
            }

        }
        String str1="1,2,3,4,5,6,7,8,89,6,0,8,7,6,5,4,3,5,6,7,4,3,5,6,7,8,5,4,3,4,5,6,7,5,4,3,5,6";
        BigInteger abc=new BigInteger(str1);
    }
}
