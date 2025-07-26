package Classes;

abstract class Demo {
    int a;
    abstract void demo();
    {
        System.out.println("This is my Demo class..!!" + a);
    }
}
class Demo2 extends Demo{
    void demo(){
        System.out.println("This is my abstract demo methods");
    }
}
//object initialization using Constructor........
class Car{
    String name;
    String color;
    Car(String n,String c){
        this.name=n;
        this.color=c;
    }
    public void display(){
        System.out.println(name+" "+color);
    }
}
//object initialization using methods........
class Animal{
    String color;
    int age;
    void initValue(String c,int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
}

public class PracticeOnClassAndObject {
    String name;
    String color;
    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        demo2.demo();
        Animal animal=new Animal();
        animal.initValue("red",4);
        animal.display();
        PracticeOnClassAndObject practiceOnClass=new PracticeOnClassAndObject();
        practiceOnClass.color="red";
        practiceOnClass.name="Vicky";
        System.out.println(practiceOnClass.name+" "+practiceOnClass.color);
        Car car=new Car("Bolano","black");
        car.display();
    }
}
