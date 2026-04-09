package OwnHashMap;

public class MyMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer,Integer> map=new MyHashMap<>();
        map.put(1,10);
        map.put(2,12);
        map.put(3,13);
        map.put(4,14);
        map.put(5,15);
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        System.out.println(map.get(4));
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        MyHashMap<String,Integer> map1=new MyHashMap<>();
        map1.put("Vicky",5);
        map1.put("Aman",4);
        map1.put("Ansh",4);
        System.out.println(map1.get("Ansh"));
    }
}
