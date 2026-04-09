package ShashCode.NumberConversionSystem;

public class OctalToDecimal {
    public void octalToDecimal(String num){  //4566
        int pos=0, result=0;
        for(int i=num.length()-1;i>=0;i--){
            int val= (int)num.charAt(i)-'0';
            result=result+val*(int)Math.pow(8,pos);
            pos++;
        }
        System.out.println("Decimal Value is :- "+result);
    }
    public static void main(String[] args) {
        OctalToDecimal oc=new OctalToDecimal();
        oc.octalToDecimal("451");
    }
}
