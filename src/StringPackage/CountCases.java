package StringPackage;

public class CountCases {
    public static void main(String[] args) {
        String str="Vicky&@ Gupta123&";
        int count=0,n=str.length();
        //counting upper case............
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Total Upper cases are :- "+count);

        //counting upper case............
        count=0;
        for(int i=0;i<n;i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Total Lower cases are :- "+count);
    }
}
