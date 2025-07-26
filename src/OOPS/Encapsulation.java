package OOPS;

import java.util.Date;

class DataHiding{
    private String name;
    private int age;
    private String dept;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        DataHiding dataHiding=new DataHiding();
        dataHiding.setName("Vicky");
        dataHiding.setDept("Mca");
        dataHiding.setAge(24);
        System.out.println("Name :- "+dataHiding.getName()+
                ", Department :- "+dataHiding.getDept()+
                ", Age :- "+dataHiding.getAge());
    }
}












