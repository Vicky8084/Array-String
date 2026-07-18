package CotivityPrepration.StringClass;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter an String to Check it is Palindrome or Not :- ");
        String str = sc.next();
        if(palindrome(str)){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }

    //Viv
    public static boolean palindrome(String str){
        int start = 0, end = str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
