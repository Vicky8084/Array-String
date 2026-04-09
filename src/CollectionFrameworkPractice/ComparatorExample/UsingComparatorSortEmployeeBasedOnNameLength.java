package CollectionFrameworkPractice.ComparatorExample;

import java.util.Comparator;
import java.util.TreeSet;


public class UsingComparatorSortEmployeeBasedOnNameLength {
    public static void main(String[] args) {
        Comparator<Employee> comparator=(emp1,emp2)->{
            return emp1.getName().length() < emp2.getName().length() ? 1 : emp1.getName().length() == emp2.getName().length() ? 0 : -1;
        };
        TreeSet<Employee> ts=new TreeSet<>(comparator);
        ts.add(new Employee(101,"Vicky Gupta",50000.34));
        ts.add(new Employee(102,"Sunny Gupta",45000.34));
        ts.add(new Employee(103,"Aman Gupta",90444.90));
        ts.add(new Employee(104,"Ansh Gupta",50234.34));
        for(Employee key : ts){
            System.out.println(key);
        }
    }
}
