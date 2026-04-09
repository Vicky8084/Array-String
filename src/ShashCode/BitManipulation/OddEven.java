package ShashCode.BitManipulation;

import java.util.Scanner;

public class OddEven {
    public boolean oddEven(int num){
        return (num & 1)==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Numbr to Check Odd or Even :- ");
        int num=sc.nextInt();
        OddEven oddEven=new OddEven();
        if(oddEven.oddEven(num)){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }
    }
}
/*
How it works:
- We check the Least Significant Bit (LSB).
- If LSB is 1 → number is Odd
- If LSB is 0 → number is Even

Example:
num = 13
Binary of 13  -> 1101
Binary of 1   -> 0001

Perform AND (&):
1101
0001
----
0001  → LSB = 1 → Odd

Reason:
- Binary 0001 (base 2) = 1 (odd)
- Binary 0000 (base 2) = 0 (even)
*/

