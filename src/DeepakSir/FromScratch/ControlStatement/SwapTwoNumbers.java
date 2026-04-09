package DeepakSir.FromScratch.ControlStatement;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of A :- ");
        int a=sc.nextInt();
        System.out.print("Enter Value of B :- ");
        int b=sc.nextInt();
        System.out.println("Before Swapping\nValue of A :- "+a+"\nValue of B :- "+b);
//        int c=b;
//        b=a;
//        a=c;
//        a=a+b;
//        b=a-b;
//       a=a-b;
//        a=a*b;
//        b=a/b;
//        a=a/b;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping\nValue of A :- "+a+"\nValue of B :- "+b);
    }
}
