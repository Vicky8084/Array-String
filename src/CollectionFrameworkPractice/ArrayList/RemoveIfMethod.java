package CollectionFrameworkPractice.ArrayList;

import java.util.ArrayList;
class Student{
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Id :- "+id+
                " Name :- "+name+
                " Marks :- "+marks;
    }
}
public class RemoveIfMethod {

    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(123,"Vicky Gupta",89));
        students.add(new Student(120,"Anuj Kumar",39));
        students.add(new Student(124,"Sunny Gupta",90));
        students.add(new Student(121,"Amit Kumar",32));
        students.removeIf(mark->mark.marks<40);
        for(int i=0;i< students.size();i++){
            System.out.println(students.get(i));
        }
    }
}
