package ShashCode.DigitManipulation;

public class GCD {
    public void findGCD(int num1, int num2){//num1 8, num2 12
        num1=Math.abs(num1); // if value is negative then here we are making it positive
        num2=Math.abs(num2); // if value is negative then here we are making it positive
        int gcd=1;
        //cases for handling zero(0)
        if(num1==0 && num2==0) gcd=0;
        if(num1==0) gcd=num2;
        if(num2==0) gcd=num1;

        int min=Math.min(num1,num2);
        for(int i=1;i<=min;i++){
            if(num2%i==0 && num1%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD is :- "+gcd);
    }

    // Finding GCD Euclidian Method
    public int findGCDEuclidianMethod(int num1, int num2){
        num1=Math.abs(num1); //if value is negative then here we are making it positive
        num2=Math.abs(num2); //if value is negative then here we are making it positive
        //handling zero(0) cases
        if(num1==0 && num2==0) return 0;
        if(num1==0) return num2;
        if(num2==0) return num1;
        while (num2>0){
            if(num1<num2){
                int c=num1;
                num1=num2;
                num2=c;
            }
            num1=num1-num2;
        }
        return num1;
    }

    // Finding GCD Euclidian Method but more optimized
    public int findGCDEuclidianMethodOptimized(int num1, int num2){
        num1=Math.abs(num1); //if value is negative then here we are making it positive
        num2=Math.abs(num2); //if value is negative then here we are making it positive
        //handling zero(0) cases
        if(num1==0 && num2==0) return 0;
        if(num1==0) return num2;
        if(num2==0) return num1;
        while (num2>0){
            int c=num2;
            num2=num1%num2;
            num1=c;
        }
        return num1;
    }


    public static void main(String[] args) {
        GCD gcd=new GCD();
        gcd.findGCD(15,30);
        System.out.println(gcd.findGCDEuclidianMethod(12,32));
        System.out.println(gcd.findGCDEuclidianMethodOptimized(12,33));
    }
}
