package LambdaExpression.PredicateInLambda;

import java.util.function.Predicate;

public class StartWithLatterV {
    public static void main(String[] args) {
        Predicate<String> isStartWithLatterV = x -> x.toLowerCase().charAt(0)=='v';
        System.out.println(isStartWithLatterV.test("Vicky"));
    }
}
