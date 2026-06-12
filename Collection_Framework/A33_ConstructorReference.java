package Collection_Framework;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;

class Student{
    private String name;
    private int age;

    Student()
    {

    }

    Student(String name)
    {
        this.name=name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Age=" + age +
                '}';
    }
    
}

public class A33_ConstructorReference {
    

    public static void main(String args[])
    {
        List<String> names=Arrays.asList("Riya","Karan","Shreya");

        List<Student> studs=new ArrayList<>();

        //normal way
        // for(String n:names)
        // {
        //     studs.add(new Student(n));
        // }


        //another way using streams
        // studs=names.stream()
        //     .map(n->new Student(n))
        //     .toList();

        //constructor reference way
        studs=names.stream()
            .map(Student::new)
            .toList();


        System.out.println(studs);

    }
    
}
