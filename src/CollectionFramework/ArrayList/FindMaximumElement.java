package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class FindMaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
