package CotivityPrepration.StringClass;

import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String string = "VickyProgramming";
        HashMap<Character, Integer> map =new HashMap<>();
        for(int i=0;i<string.length();i++){
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),1);
            }else{
                map.put(string.charAt(i),map.get(string.charAt(i))+1);
            }
        }

        for(Character key : map.keySet()){
            System.out.println(key +" :- "+map.get(key));
        }
    }
}
