package DeepakSir.FromScratch.ControlStatement;

import java.util.Scanner;

public class LargestAmongTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers to Check Which one is Greatest :- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is Greater Then "+num2);
        }
        else System.out.println(num2+" is Greater then +"+num1);
    }
}
