package ShashCode.DigitManipulation;

public class AppendDigit {
    public void appendDigit(int num, int digit){
        if(digit<0 || digit>9){
            System.out.println("Invalid Input");
            return;
        }
        boolean isNeg=false;
        if(num<0){
            num= -1 * num;
            isNeg=true;
        }
        int res=num*10+digit;
        if (isNeg){
            res=-1*res;
        }
        System.out.println("New Digit is :- "+res);
    }
    public static void main(String[] args) {
        AppendDigit ad=new AppendDigit();
        ad.appendDigit(-1,9);
    }
}
