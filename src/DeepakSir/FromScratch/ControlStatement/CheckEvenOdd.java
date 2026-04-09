package DeepakSir.FromScratch.ControlStatement;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number to check if is it Odd or Even :- ");
        int n=sc.nextInt();
        if(n%2==0) System.out.println("Given Number "+n+" is Even Number");
        else System.out.println("Given Number "+n+" is Odd Number");
    }
}
