package TCSString;

import java.util.HashMap;
import java.util.Scanner;

public class CalculateFrequencyOfCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        int n=str.length();
        HashMap<Character,Integer> set=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(!set.containsKey(ch)){
                set.put(ch,1);
            }
            else{
                set.put((str.charAt(i)),set.get(ch)+1);
            }
        }

        for(Character key : set.keySet()){
            if(set.get(key)>1){
                System.out.println(key+" :- "+set.get(key));
            }
        }
    }
}
