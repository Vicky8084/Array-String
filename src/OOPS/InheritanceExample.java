package OOPS;
class A{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("Sum is :- "+(a+b));
    }
}
class B extends A{
    public void add(int x,int y){
        int a=10;
        int b=20;
        System.out.println("Sum is :- "+(a+b));
    }
}
class C extends B{

}
public class InheritanceExample {

}
