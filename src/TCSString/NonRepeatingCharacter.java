package TCSString;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :- ");
        String str=sc.nextLine();
        int n=str.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Character key : map.keySet()){
            if(map.get(key)==1){
                System.out.println(key+" :- "+map.get(key));
            }
        }
    }
}
