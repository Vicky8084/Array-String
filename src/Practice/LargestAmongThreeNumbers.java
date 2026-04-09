package Practice;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number :- ");
        int n2=sc.nextInt();
        System.out.print("Enter Third Number :- ");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3) System.out.println("Greatest Number among "+n1+", "+n2+" and "+n3+" is "+n1);
        else if (n2>n1 && n2>n3) System.out.println("Greatest Number among "+n1+", "+n2+" and "+n3+" is "+n2);
        else System.out.println("Greatest Number among "+n1+", "+n2+" and "+n3+" is "+n3);
    }
}
