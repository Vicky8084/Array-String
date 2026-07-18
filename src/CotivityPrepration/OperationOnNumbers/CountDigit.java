package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to Count its Digit :- ");
        int n= scanner.nextInt();
        if(n==0){
            System.out.println(1);
            return;
        }
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
