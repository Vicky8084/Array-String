package TCSArray;

import java.util.ArrayList;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int []arr={4,3,0,0,3,2,1,4,2,4,5,3,3,3,3};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
            if(count==0){
                list.add(arr[i]);
            }
        }
        System.out.println("Non-Repeating Elements :- "+list);
    }
}
