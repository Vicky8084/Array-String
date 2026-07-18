package CotivityPrepration.StringClass;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character to Print Their ASCII value :- ");
        char ch=sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
