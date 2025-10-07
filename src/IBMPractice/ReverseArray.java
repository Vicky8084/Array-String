package IBMPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,8,9,6,7,1};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.print("Reverse array :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        String str="Vicky Gupta", rev="";
        int len=str.length();

        for(int i=0;i<len;i++){
            char ch =str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
        System.out.println();
        System.out.println();
        System.out.println();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<len/2;i++){
            char ch=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(len-1-i));
            sb.setCharAt(len-1-i,ch);
        }
        System.out.println(sb);
    }
}
