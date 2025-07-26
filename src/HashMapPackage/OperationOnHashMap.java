package HashMapPackage;
import java.util.*;

public class OperationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India",140);
        map.put("China",120);
        map.put("USA",70);
        System.out.println(map);
        map.put("India",450);
        System.out.println(map);
        if(map.containsKey("Inia")){
            System.out.println(map.get("India"));
        }
        else{
            System.out.println("null");
        }
        for(Map.Entry<String,Integer> key : map.entrySet()){
            System.out.print(key.getKey()+":- "+key.getValue()+" ");
        }
        HashMap<String, List<String>> list=new HashMap<>();
        list.put("friends",List.of("Vcky","Sunny"));
        System.out.println(list);

        HashMap<String, List<String>> list1=new HashMap<>();
        ArrayList<String> friendList=new ArrayList<>();
        friendList.add("Vicky");
        friendList.add("Sunny");
        list1.put("Friends",friendList);
        System.out.println(list1);
    }
}
