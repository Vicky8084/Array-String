package ShashCode.DigitManipulation;

public class EvenOdd {
    public boolean evenOdd(int num){
        return (num%2==0);
    }
    public static void main(String[] args) {
        EvenOdd eo=new EvenOdd();
        if(eo.evenOdd(1)){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }
    }
}
