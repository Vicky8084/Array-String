package Conversion;
import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int n){
        if (n == 0) return "0";

        StringBuffer res = new StringBuffer();

        while (n > 0) {
            res.append(n % 2);
            n = n / 2;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Decimal Digit to Convert it into Binary Number :- ");
        int n=sc.nextInt();
        System.out.println("Binary Number is :- "+decimalToBinary(n));  //if n=13 then output is 1101
    }
}
