package Practice2;

import java.util.HashMap;

public class AllSymmetricPair {
    public static void main(String[] args) {
       // int[][] arr={{1,2},{2,1},{4,5},{7,8},{5,3},{8,7}};
        //int n=arr.length;
//        for (int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i][0] ==arr[j][1] && arr[i][1]==arr[j][0]){
//                    System.out.print("("+arr[i][0]+","+arr[i][1]+"),");
//                }
//            }
//        }
        int[][] arr={{1,2},{2,1},{4,5},{7,8},{5,3},{8,7}};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println("(" + b + "," + a + ") and (" + a + "," + b + ")");
            } else {
                map.put(a, b);
            }
        }
    }
}
