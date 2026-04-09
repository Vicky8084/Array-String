package DeepakSir.FromScratch.ControlStatement;

import java.util.Scanner;

public class LargestAmongThreeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers to Check Which one is Greatest :- ");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+ " is Greatest Number among "+num1+", "+num2+" and "+num3);
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+ " is Greatest Number among "+num1+", "+num2+" and "+num3);
        }
        else{
            System.out.println(num3+ " is Greatest Number among "+num1+", "+num2+" and "+num3);
        }
    }
}
