package SlidingWindow;

import java.util.ArrayList;

public class FirstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr={12,-1,-7,8,-15,30,16,28};
        int k=3;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length-k;i++){
            for(int j=i;j<k+i;j++){
                if(arr[j]<0){
                    list.add(arr[j]);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
