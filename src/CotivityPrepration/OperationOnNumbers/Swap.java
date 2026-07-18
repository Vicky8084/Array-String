package CotivityPrepration.OperationOnNumbers;

public class Swap {
    public static void main(String[] args) {
        int a=10,b=12;
        System.out.println("Before Swap : a -> "+a+", b -> "+b);
//        int temp=a;
//        a=b;
//        b=temp;
        a=a+b;  // a = 10+12 -> 22
        b=a-b;  // b = 22-12 -> 10
        a=a-b;  // a = 22-10 -> 12

        System.out.println("After Swap  : a -> "+a+", b -> "+b);
    }
}
