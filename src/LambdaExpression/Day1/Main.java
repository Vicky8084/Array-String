package LambdaExpression.Day1;

public class Main {
    public static void main(String[] args) {
        Employee se=()->"Software Engineer";
        System.out.println(se.getName());
        Employee tester=()->"Software Tester";
        System.out.println(tester.getName());
    }
}
