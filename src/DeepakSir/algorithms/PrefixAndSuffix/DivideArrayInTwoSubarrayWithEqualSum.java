package DeepakSir.algorithms.PrefixAndSuffix;
public class DivideArrayInTwoSubarrayWithEqualSum {
    public static void bruteForce(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int sum1=0,sum2=0;
            for(int j=0;j<=i;j++){
                sum1+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                sum2+=arr[j];
            }
            if(sum1==sum2){
                System.out.println("true");
                return;
            }
        }
        System.out.println("False");
    }
    public static void prefixMethod(int[] arr){
        int prefixSum=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            prefixSum+=arr[i];
            if(prefixSum==(sum-prefixSum)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static void main(String[] args) {
        int[]arr={3,4,-2,5,8,20,-10,8};
        prefixMethod(arr);
    }
}