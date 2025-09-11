package PracticeQuestions.OperationOnNumber;

import java.util.Scanner;

public class FindNthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to print :- ");
        int n = sc.nextInt();
        int res = 2;

        System.out.print("Prime Numbers are :- ");
        while (n!=0) {
            int count = 0;
            for (int i = 2; i <= res / 2; i++) {
                if (res % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(res + ", ");
                n--;
            }
            res++;
        }
    }
}
