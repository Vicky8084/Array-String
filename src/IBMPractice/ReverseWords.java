package IBMPractice;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        str=str.trim();
        String str1[]=str.split(" +");
        StringBuffer sb=new StringBuffer();
        for(int i=str1.length-1;i>=0;i--){
            sb.append(str1[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
