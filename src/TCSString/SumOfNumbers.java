package TCSString;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter First Number Number :- ");
//        String str1=sc.nextLine();
//        System.out.print("Enter Second Number :- ");
//        String str2=sc.next();
//        int sum=Integer.parseInt(str2)+Integer.parseInt(str1);
//        System.out.println("Sum of String Numbers :- "+sum);
        System.out.print("Enter String Number :- ");
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println("Sum of String number is  :- "+sum);
    }
}
