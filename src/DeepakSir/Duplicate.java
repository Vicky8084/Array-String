package DeepakSir;

public class Duplicate {
    public static void main(String[] args) {
        int []arr={3,5,4,3,2,2,1,3};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+", ");
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
        }
    }
}
