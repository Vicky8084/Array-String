package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
