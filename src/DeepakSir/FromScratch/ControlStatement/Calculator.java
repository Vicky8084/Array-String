package DeepakSir.FromScratch.ControlStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=sc.nextInt();
        String operator;
        while (true){
            operator=sc.next();
            if("=".equals(operator)){
                break;
            }
            int num=sc.nextInt();
            switch (operator){
                case "+":result+=num;
                break;
                case "-":result-=num;
                break;
                case "*":result*=num;
                break;
                case "%":result%=num;
                break;
                case "/":result/=num;
                break;
            }
        }
        System.out.println(result);
    }
}
