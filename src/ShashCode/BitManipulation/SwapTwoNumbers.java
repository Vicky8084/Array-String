package ShashCode.BitManipulation;

public class SwapTwoNumbers {
    public void swapTwoNumbers(int num1, int num2){
        System.out.println("value of Num1 and Num2 before Swap :- "+num1+" "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("value of Num1 and Num2 after Swap :- "+num1+" "+num2);
    }
    public static void main(String[] args) {
        SwapTwoNumbers sn=new SwapTwoNumbers();
        sn.swapTwoNumbers(12,34);
    }
}
