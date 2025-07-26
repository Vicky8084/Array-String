package StringPackage;

public class ReverseString {
    public static void main(String[] args) {
        String str="Vicky Gupta",str2="";
//        for(int i=str.length()-1;i>=0;i--){
//            str2+=str.charAt(i);
//        }
//        System.out.println(str2);

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            str2=ch+str2;
        }
        System.out.println(str2);
    }
}
