import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;String name;

    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
public class Main {

    public static void main(String[] args) {
        List<Student>ls=new ArrayList<>();
        ls.add(new Student(33, "Soham"));
        ls.add(new Student(21, "Prathmesh"));
        ls.add(new Student(11, "Vinay"));
        ls.add(new Student(44, "Ash"));
        ls.add(new Student(19, "Ads"));

        Comparator<Student>cn=(Student o1, Student o2)->o1.age>o2.age?1:-1;
        ls.sort(cn);

        for(Student i:ls)
        {
            System.out.println(i.name+ " "+ i.age);
        }

        System.out.println("Add an avatar for the user");
    }
}