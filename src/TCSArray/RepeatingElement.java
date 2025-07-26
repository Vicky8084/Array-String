package TCSArray;

import java.util.ArrayList;

public class RepeatingElement {
    public static void main(String[] args) {
        int []arr={4,3,0,0,3,2,1,4,2};
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[j]);
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
        }
        System.out.println(list);
    }
}
