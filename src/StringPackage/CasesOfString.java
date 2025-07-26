package StringPackage;

import java.util.Locale;

public class CasesOfString {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama50";
        //printing only upper cases.............
//        for(int i=0;i<str.length();i++){
//            if(Character.isUpperCase(str.charAt(i))){
//                System.out.print(str.charAt(i)+" ");
//            }
//        }
//        //printing only Lower cases.........
//        System.out.println();
//        for(int i=0;i<str.length();i++){
//            if(Character.isLowerCase(str.charAt(i)))
//                System.out.print(str.charAt(i)+" ");
//        }
//
//        //printing only digits from a String.............
//        System.out.println();
//        for(int i=0;i<str.length();i++){
//            if(Character.isDigit(str.charAt(i))){
//                System.out.print(str.charAt(i)+" ");
//            }
//        }
//
//        //printing only digits or non Charactor from a String.............
//        System.out.println();
//        for(int i=0;i<str.length();i++){
//            if(Character.isLetterOrDigit(str.charAt(i))){
//                System.out.print(str.charAt(i)+" ");
//            }
//        }
//
//        //printing only digits or non Charactor from a String.............
//        System.out.println();
//        for(int i=0;i<str.length();i++) {
//            if (!Character.isLetterOrDigit(str.charAt(i))) {
//                System.out.print(str.charAt(i) + " ");
//            }
//        }
//
//        //Convert all Upper case to Lower case.............
//        System.out.println();
//           String str2="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(Character.isUpperCase(ch)){
//                str2+=Character.toLowerCase(ch);
//            }
//            else{
//                str2+=ch;
//            }
//        }
//        System.out.println(str2);
//        String str2="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(Character.isUpperCase(ch) || Character.isLetter(ch)){
//                str2+=Character.toLowerCase(ch);
//            }
//            else{
//                str2+=ch;
//            }
//        }
        str=str.toLowerCase();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                str1+=str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
