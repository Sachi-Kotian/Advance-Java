package Collection_Framework;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    int rollNo;

    Student(String name,int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    // @Override
    // public int compareTo(Student that) {
    //     return this.rollNo-that.rollNo;
    // }

    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }
    
}

public class A25_Comparable {
    public static void main(String args[])
    {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student("Priya",1));
        stud.add(new Student("Neha",4));
        stud.add(new Student("Vina",2));
        stud.add(new Student("Sahil",3));
        System.out.println(stud);

        Student s1=new Student("Priya",1);
        Student s2=new Student("Sahil",3);

        //System.out.println(s1.compareTo(s2));

        Collections.sort(stud);
        System.out.println(stud);

    }
    
}
