package ShashCode.DigitManipulation;

public class AppendDigitAtFront {
    public int countDigit(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            num=-1*num;
        }
        int result=(int)Math.log10(num)+1;
        return result;
    }
    public void appendDigitAtFront(int num, int digit){
        if(digit < 0 || digit > 9){
            System.out.println("Invalid Digit");
            return;
        }
        int result=digit*(int)Math.pow(10,countDigit(num));
        boolean isNeg=false;
        if(num<0){
            num=-1*num;
            isNeg=true;
        }
        int sum=result+num;
        if(isNeg){
            sum=-1*sum;
        }
        System.out.println("the digit is :- "+sum);
    }
    public static void main(String[] args) {
        AppendDigitAtFront ad=new AppendDigitAtFront();  //num=4567, digit =5, result =4
        ad.appendDigitAtFront(0,9);
    }
}
