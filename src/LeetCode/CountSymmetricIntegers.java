package LeetCode;

public class CountSymmetricIntegers {
    public static void main(String[] args) {
        int low=1,high=100;
        int count=0;
        for(int i=low;i<=high;i++){
            int cpy=i;
            count=0;
            while(cpy!=0){
                cpy/=10;
                count++;
            }
            int half=count/2;
            int full=count/2;
            int sum=0, rem=0;
             while(i!=0){
                while(half!=0){
                    half--;
                    rem=i%10;
                    sum=sum+rem;
                    i/=10;
                }
            }
            int sum1=0;
            while(i!=0){
                while(full!=0){
                    full--;
                    rem=i%10;
                    sum1=sum1+rem;
                    i/=10;
                }
            }
            if(sum1==sum){
                count++;
            }
        }
        System.out.println(count);;
    }
}
