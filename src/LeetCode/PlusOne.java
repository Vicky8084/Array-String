package LeetCode;

public class PlusOne {
    public static void main(String[] args) {
        int []digits={1,2,3,4};
        long digit=0;
        for(int i=0;i<digits.length;i++){
            digit=digit*10+digits[i];
        }
        digit++;
        String str=Long.toString(digit);
        int []ans=new int[str.length()];
        for(int i=0;i<str.length();i++){
            ans[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
