package Collection_Framework;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
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

    @Override
    public int compareTo(Student that) {
        return this.rollNo-that.rollNo;
    }

   
    
}


public class A26_Comparator {
    public static void main(String args[])
    {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student("Priya",1));
        stud.add(new Student("Neha",4));
        stud.add(new Student("Vina",2));
        stud.add(new Student("Sahil",3));

        System.out.println(stud);


        //default sorting according to comparable
        Collections.sort(stud);
        System.out.println(stud);

        //sorts according to comparator
        // Collections.sort(stud,new Comparator<Student>(){

        //     @Override
        //     public int compare(Student s1,Student s2)
        //     {
        //         return s1.name.compareTo(s2.name);
        //     }
        // });
        // System.out.println(stud);

        // Collections.sort(stud,(s1,s2)-> s1.name.compareTo(s2.name));
        // System.out.println(stud);


        Comparator<Student> cp=new Comparator<>(){
            @Override
            public int compare(Student s1,Student s2)
            {
                return s1.name.compareTo(s2.name);
            }
        };
        Collections.sort(stud,cp);
        System.out.println(stud);
    }
    
    
}
