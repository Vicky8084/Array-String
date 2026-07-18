package CotivityPrepration.OperationOnNumbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any Number to check it is Palindrome or not :- ");
        int n=scanner.nextInt();
        int cpy=n,rem=0,rev=0;
        while (cpy>0){
            rem=cpy%10;
            rev=rev*10+rem;
            cpy/=10;
        }
        if(rev==n){
            System.out.println("Given Number is Palindrome");
        }else{
            System.out.println("Given Number is not Palindrome");
        }
    }
}
