package OOPS;
class Animal{
    void eat(){
        System.out.println("This animal is eating..!!");
    }
    void run(){
        System.out.println("This animal is running..!!");
    }
    private void superMethod(){
        System.out.println("This is super private method..!!");
    }
    void privateSuperMethod(){
        superMethod();;
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking..!!");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
        dog.eat();
        dog.run();
        Animal animal=new Animal();
        animal.eat();
        animal.privateSuperMethod();
    }
}
