package CotivityPrepration;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr={-2,3,-4};
        int product=1,maxProduct=0;
        for(int key : arr){
            product=product*key;
            if(product>maxProduct){
                maxProduct=product;
            }
            if(product<1){
                product=1;
            }
        }
        System.out.println(maxProduct);
    }
}
