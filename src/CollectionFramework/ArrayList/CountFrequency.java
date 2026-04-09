package CollectionFramework.ArrayList;
import java.util.ArrayList;
public class CountFrequency{
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
        for(int i=0;i<list.size()-1;i++){ // .   5, 1, 6, 17, 6, 8, 6, 17, 6, 8
            int count=1;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    count++;
                    list.remove(j);
                }
            }
            System.out.println(list.get(i)+":- "+count);
        }
    }
}
