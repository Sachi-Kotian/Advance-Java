package Collection_Framework;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

class Student{
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
    
}

public class A20_CustomSet {
    public static void main(String args[])
    {
        Set<Student> set=new HashSet<>(); 
        set.add(new Student("Priya",1));
        set.add(new Student("Rahul",2));
        set.add(new Student("Minal",3));

        System.out.println(set);
        //wont add duplicates
        set.add(new Student("Priya",1));
        System.out.println(set);
    }
    
}
