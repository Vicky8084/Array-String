package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class FirstNonRepeatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(8);
        list.add(5);
        for(int i=0;i<list.size();i++){ // 5 1 6 17 6 8 6 17 6 8 5
            int count=0;
            for(int j=0;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First Non-Repeating Element is :- "+list.get(i));
                return;
            }
        }
        System.out.println("There is not any Non-Repeating First Element");
    }
}
