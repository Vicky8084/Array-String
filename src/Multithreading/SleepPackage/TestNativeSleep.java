package Multithreading.SleepPackage;

import javax.swing.plaf.TableHeaderUI;
import java.util.TreeMap;

public class TestNativeSleep extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        TestNativeSleep testNativeSleep = new TestNativeSleep();
        testNativeSleep.start();
    }
}
