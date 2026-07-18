package LambdaExpression.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student{
    int id;
    String  name;
    public Student(int id, String name){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ClassSorting {

    public static void main(String[] args) {
        Student cs1 = new Student(4,"Vicky Gupta");
        Student cs2=new Student(1,"Sunny Gupta");
        Student cs3=new Student(3,"Ayush Ranjan");
        Student cs4=new Student(2,"Ansh Prasad");

        List<Student> list = new ArrayList<>();
        list.add(cs1);
        list.add(cs2);
        list.add(cs3);
        list.add(cs4);

        System.out.println("Normal List "+list);
        Collections.sort(list,(a, b)-> b.id-a.id);
        System.out.println("Manual Sort By ID :-  "+list);

        Collections.sort(list,(a, b)-> b.name.compareTo(a.name));
        System.out.println("Manual Sort By Name :-  "+list);

    }
}
