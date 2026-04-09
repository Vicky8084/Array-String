package ShashCode.DigitManipulation;

import java.util.Scanner;

public class CountDigit {
    public static void countDigitByFormula(int num){
        /*
        log of n at the base of 10 (log(n)base 10 ) +1 this formula only handle +ve value and not handled
        for 0 and -ve values that's why if n==0 I am printing 1 and no need to check further that's why return here.
        and if -ve number that's why after multiplication of -1 it becomes +ve number.

        -->> Time Complexity and Space Complexity is O(1)
         */

        if(num==0){
            System.out.println("Number of Digit is :- "+1);
            return;
        }
        if(num<0){
            num=-1*num;
        }
        int rslt=(int)Math.log10(num)+1;
        System.out.println("Number of Digit is :- "+rslt);
    }

    public static void countDigitByDivision(int num){

        /*
        -->> Time Complexity is log of n at the base 10 (log n(10))
        -->> Space Complexity is O(1)
        -->> this approach also not handles 0 and -ve number so we will use same approach if number -ve than
        we multiply it by -1
        -->> if number is 0 then we directly print 1;

         */
        if(num==0){
            System.out.println("Number of Digit is :- "+1);
            return;
        }
        if(num<0){
            num= -1 *num;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Number of Digit is :- "+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        countDigitByFormula(0);
        countDigitByDivision(0);
    }
}
