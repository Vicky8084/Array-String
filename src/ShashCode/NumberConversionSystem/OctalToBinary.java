package ShashCode.NumberConversionSystem;

public class OctalToBinary {
    public void octalToBinary(int num){
        StringBuffer sb=new StringBuffer();
        while (num>0){
            sb.append(num%8);
            num/=8;
        }
        sb.reverse();  //till here I have Converted Decimal

    }
    public static void main(String[] args) {

    }
}
