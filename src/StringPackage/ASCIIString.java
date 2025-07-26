package StringPackage;

public class ASCIIString {
    public static void main(String[] args) {
        String str="Vicky Gupta";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" :- "+(int)str.charAt(i));
        }
    }
}
