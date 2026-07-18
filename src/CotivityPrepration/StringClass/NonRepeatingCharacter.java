package CotivityPrepration.StringClass;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String string = "Vicky Programming";
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Character key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key +" :- "+map.get(key));
            }
        }
    }
}
