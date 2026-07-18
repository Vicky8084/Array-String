package Stream;

import java.util.Arrays;

public class SumOfEven {
    public static void main(String[] args) {
        //Imperative Approach
        int[] arr1={4,5,3,6,7,2,3};
        int sum1=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                sum1+=arr1[i];
            }
        }
        System.out.println(sum1);

        //Using Stream
        int[] arr2={4,5,3,6,7,2,3};
        int sum2= Arrays.stream(arr2).filter(x -> x % 2 == 0).sum();
    }


}
