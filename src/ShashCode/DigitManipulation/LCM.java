package ShashCode.DigitManipulation;

public class LCM {
    public int findGCD(int num1,int num2) {

        if (num1 == 0 && num2 == 0) return 0;
        if(num1==0) return num2;
        if(num2==0) return num1;
        while (num2>0){ //GCD(num1,num2) => GCD(num1
            int c=num2;
            num2=num1%num2;
            num1=c;

        }
        return num1;
    }
    public void findLCM(int num1, int num2){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if(num1==0 && num2==0){
            System.out.println("Undefined");
            return;
        }
        int lcm=(num1*num2)/findGCD(num1,num2);
        System.out.println("LCM is :- "+lcm);
    }
    public static void main(String[] args) {
        LCM lcm=new LCM();
        lcm.findLCM(0,0);
    }
}
