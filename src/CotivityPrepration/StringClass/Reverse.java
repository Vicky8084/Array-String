package CotivityPrepration.StringClass;

public class Reverse {
    public static void main(String[] args) {
        String s = "Vicky Gupta";
        String string ="";
        for(int i=s.length()-1;i>=0;i--){
            string+=s.charAt(i);
        }
        System.out.println(string);
    }
}
