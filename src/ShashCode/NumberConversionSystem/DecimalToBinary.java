package ShashCode.NumberConversionSystem;

public class DecimalToBinary {
    public void decimalToBinary(int num){
        StringBuffer sb=new StringBuffer();
        while(num>0){
            sb.append(num%2);
            num/=2;
        }
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        DecimalToBinary db=new DecimalToBinary();
        db.decimalToBinary(9);
    }
}
