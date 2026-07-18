package LambdaExpression.Thread;

public class MyClass {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=1;i<=10;i++){
                System.out.println("Vicky Gupta "+i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.run();
    }
}
