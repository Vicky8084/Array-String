package Practice;

import java.util.Scanner;

public class PositiveOrNegative {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter any number to Check Positive or Negative :- ");
//        int n=sc.nextInt();
//        if(n>0) System.out.println("Given Number "+n+" is Positive Number");
//        else if(n==0) System.out.println("Given Number "+n+" is Zero");
//        else System.out.println("Given Number "+n+" is Negative Number");
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number :- ");
        int n=sc.nextInt();
        if(n>=0){
            if(n==0) System.out.println("Given Number "+n+" is Zero");
            else System.out.println("Given Number "+n+" is Positive Number");
        }
        else System.out.println("Given Number "+n+" is Positive Number");
    }
}
