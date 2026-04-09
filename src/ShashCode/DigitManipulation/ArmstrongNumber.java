package ShashCode.DigitManipulation;

public class ArmstrongNumber {

    public void armstrongNumber(int num){
        int result=0,cpy=num;
        int count=(int)Math.log10(num)+1;
        while (num>0){
            int rem=num%10;
            result=result+(int)Math.pow(rem,count);
            num/=10;
        }
        if(result==cpy){
            System.out.println("Given Number is Armstrong Number");
        }
        else{
            System.out.println("Not");
        }

    }
    public static void main(String[] args) {
        ArmstrongNumber arm=new ArmstrongNumber();
        arm.armstrongNumber(6);
    }
}
