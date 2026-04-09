package ShashCode.DigitManipulation;

public class FindPower {
    public void findPower(int num, int pow){
        boolean isNeg=false;
        if(pow<0){
            pow= -1*pow;
            isNeg=true;
        }
        double res=1;
        for(int i=0;i<pow;i++){
            res*=num;
        }
        if(isNeg){
            res=1/res;
        }
        System.out.println("Power is :- "+res);
    }
   public void fastExponential(int num,int pow){
        boolean isNeg=false;
        if(pow<0){
            pow= -1 *pow;
            isNeg=true;
        }
        double result=1.0;
        while (pow>0){
            if(pow%2!=0){
                result=result*num;
                pow--;
            }
            pow/=2;
            num=num*num;
        }
        if(isNeg){
            result=1/result;
        }
       System.out.println("Power is :- "+result);
   }

    public static void main(String[] args) {
        FindPower fp=new FindPower();
        //fp.findPower(4,-4);
        fp.fastExponential(2,-4);

    }
}
