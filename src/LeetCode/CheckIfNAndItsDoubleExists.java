package LeetCode;

public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int []arr={7,1,14,11};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==(2*arr[j])){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
}
