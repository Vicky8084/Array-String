package Strings;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String Paragraph :- ");
        String s=sc.nextLine();
        String arr[]=s.split(" +");
        StringBuffer sb=new StringBuffer();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
