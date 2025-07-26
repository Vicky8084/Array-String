package StringPackage;

import com.sun.security.jgss.GSSUtil;

public class StringBasics {
    public static void main(String[] args) {
        String str="Vicky Gupta";
        for(char val : str.toCharArray()){
            System.out.print(val +" ");
        }
        System.out.println();
        for(int i=0;i<str.length();i++){
            System.out.print(str.toCharArray()+" ");
        }
    }
}
