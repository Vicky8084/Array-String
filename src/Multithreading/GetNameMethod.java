package Multithreading;

public class GetNameMethod extends Thread {
    public void run(){
        System.out.println("This is My Thread");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello this is My Main Thread");
        System.out.println(Thread.currentThread().getName());
        GetNameMethod t = new GetNameMethod();
        t.start();

    }
}
