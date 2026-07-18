package LambdaExpression.PredicateInLambda;

import java.util.function.Predicate;

public class PrintEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x-> x % 2 == 0;
        int[] list = {4,5,6,3,2,5,6,7};
        for(Integer i : list){
            if(isEven.test(i)){
                System.out.print(i+" ");
            }
        }
    }
}
