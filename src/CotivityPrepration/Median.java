package CotivityPrepration;

public class Median {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,14,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        if(arr.length%2!=0){
            System.out.println("Median is :- "+arr[arr.length/2]);
        }else{
            float res=arr[arr.length/2]+arr[arr.length/2-1];
            //System.out.println(mid+" "+res);

            System.out.println("Median is :- "+res/2);
        }
    }
}
