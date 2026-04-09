package DeepakSir.Programs;

public class KthSmallestAndLargetElement{
    public static int kThLargestElement(int [] arr,int k){
        for(int i=0;i<arr.length-1;i++){   //5,1,4,3,2,8
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(k-1==i){
                break;
            }
        }
        return arr[k-1];
    }

    public static int kThSmallestElement(int[]arr,int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(k-1==i){
                break;
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr={6,3,4,8,9,2,1,5};
        int k=4;
        System.out.println(k+"th Largest Element :- "+kThLargestElement(arr,k));
        System.out.println(k+"th Smallest Element :- "+kThSmallestElement(arr,k));
    }
}
