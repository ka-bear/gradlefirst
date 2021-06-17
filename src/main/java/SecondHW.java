import java.util.ArrayList;

class Person{
    String name;
    int age;
}

class Professor extends Person{
    int publications,cur_id;
    public void getdata(String name, int age, int publications){
        this.name=name;
        this.age=age;
        this.publications=publications;
    }

    public void putdata() {
        System.out.println("Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", publications=" + publications +
                ", cur_id=" + cur_id +
                '}');
    }
}

class Student extends Person{
    ArrayList<Integer> marks = new ArrayList<>();
    int cur_id;
    public void getdata(String name, int age, ArrayList<Integer> marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    public void putdata() {
        System.out.println("Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", cur_id=" + cur_id +
                '}');
    }
}
public class SecondHW {
    /*
    Create three classes Person, Professor and Student. The class Person should have data members name and age.
    The classes Professor and Student should inherit from the class Person.

The class Professor should have two integer members: publications and cur_id.
There will be two member functions: getdata and putdata.
The function getdata should get the input from the user: the name, age and publications of the professor.
The function putdata should print the name, age, publications and the cur_id of the professor.

The class Student should have two data members: marks, which is an array of size  and cur_id.
It has two member functions: getdata and putdata.
The function getdata should get the input from the user: the name, age, and the marks of the student in subjects.
The function putdata should print the name, age, sum of the marks and the cur_id of the student.

For each object being created of the Professor or the Student class, sequential id's should be assigned to them starting from .
     */

}
