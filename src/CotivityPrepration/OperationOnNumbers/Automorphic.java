package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n=scanner.nextInt();
        int square = square(n),localReverse=automorphic(n), originalReverse = reverse(localReverse);
        System.out.println("Square :- "+square+", LocaReverse :- "+localReverse+", OriginalReverse :- "+originalReverse);
        if(n==originalReverse){
            System.out.println("Given Number is Automorphic");
        }else{
            System.out.println("Given Number is Not Automorphic");
        }

    }
    // n -> 25 => 625
    public static int square(int n){
        return n*n;
    }
    public static int count(int n){
        int count=0;
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static int automorphic(int n){ // n -> 25
        int rev=0,rem=0,square=square(n),count=count(n);  // square -> 625, count -> 2
        while (square>0){
            rem=square%10;
            rev=rev*10+rem;
            square/=10;
            count--;
            if(count==0){
                break;
            }
        }
        return rev;
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
