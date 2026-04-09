package CollectionFramework.ArrayList;
import java.util.ArrayList;

public class PrintList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(6);
        list.add(8);
        System.out.print("Items are :- ");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
