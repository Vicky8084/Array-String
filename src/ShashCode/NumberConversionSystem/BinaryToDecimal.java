package ShashCode.NumberConversionSystem;

public class BinaryToDecimal {
    public void binaryToDecimal(String num){
        int pos=0,result=0;
        for(int i=num.length()-1;i>=0;i--){ //num = 1^3 0^2 1^1 1^0  length = 4
            int val=num.charAt(i) -'0';
            result=result+(val*(int)Math.pow(2,pos));   //   2*1^3 + 2*0^2 + 2*1^1 + 2*1^0
            pos++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        BinaryToDecimal bd=new BinaryToDecimal();
        bd.binaryToDecimal("11111");
    }
}
