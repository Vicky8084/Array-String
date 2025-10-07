package IBMPractice;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="VickykciV";
        StringBuilder sb=new StringBuilder(str);
        int n=sb.length();
        for(int i=0;i<n/2;i++) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(n - 1 - i));
            sb.setCharAt(n - 1 - i, ch);
        }
        if(str.equals(sb.toString())){
            System.out.println("Given Strings are Palindrome");
        }
        else {
            System.out.println("Given Strings are Not palindrome");
        }
    }
}
