package BasicQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to get their factorial :- ");
        int n=sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial is :- "+fact);
    }
}
