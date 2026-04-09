package DeepakSir.Programs;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int []arr={5,4,7,2,1,0,9,8};
        int max=arr[0],min=arr[0],n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum and Minimum are :- "+max+", "+min);
    }
}
