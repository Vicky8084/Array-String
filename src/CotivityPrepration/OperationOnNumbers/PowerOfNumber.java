package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base to calculate power :- ");
        int base=scanner.nextInt();
        System.out.print("Enter Exponent to calculate Power :- ");
        int exp=scanner.nextInt();
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        System.out.println("Result is :- "+result);

    }
}
