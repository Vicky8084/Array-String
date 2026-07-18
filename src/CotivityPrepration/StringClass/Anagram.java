package CotivityPrepration.StringClass;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter First String :- ");
        String s1 = scanner.nextLine();
        System.out.print("Enter Second String :- ");
        String s2 = scanner.nextLine();
        if(anagram2(s1,s2)){
            System.out.println("Both Strings are Anagram");
        }else{
            System.out.println("Both Strings are not Anagram");
        }

    }
    public static boolean anagram2(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(!map.containsKey(ch1)){
                map.put(ch1,1);
                map.put(ch2,map.get(ch2)-1);
            }else{
                map.put(ch1,map.get(ch1)+1);
                map.put(ch2,map.get(ch2)-1);
            }
        }
        for(Character key : map.keySet()){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch,1);
            }else{
                map1.put(ch,map1.get(ch)+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(!map2.containsKey(ch)){
                map2.put(ch,1);
            }else{
                map2.put(ch,map2.get(ch)+1);
            }
        }

        for(Character key : map1.keySet()){
            if(!map1.get(key).equals(map2.get(key))){
                return false;
            }
        }
        return true;
    }
}
