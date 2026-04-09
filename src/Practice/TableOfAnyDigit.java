package Practice;

import java.util.Scanner;

public class TableOfAnyDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Digit to Print it's Table :- ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" :- "+n*i);
        }
    }
}
