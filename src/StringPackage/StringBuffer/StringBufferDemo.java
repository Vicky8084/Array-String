package StringPackage.StringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Vicky");
        System.out.println(sb.capacity());
        sb.append("Vicky Gupta ");
        System.out.println(sb.capacity());
    }
}
