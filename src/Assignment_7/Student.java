package Assignment_7;

import javax.xml.transform.Result;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Student {
    String name;
    int age;
    int[] marks;
    int grade = 12;
    int a;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void getDetails(){
        name = this.name;
        age = this.age;
        marks = this.marks;
        grade = this.grade;

        for (int i=0; i<marks.length; i++){
            a = a + marks[i];
        }
        double b = (a*100)/400;

        System.out.println("        Result");
        System.out.println("Name : "+ name);
        System.out.println("Grade: " + grade);
        System.out.println("1)  Total marks: " + Arrays.toString(marks));
        System.out.println("2)  Percentage : " + b);

    }
}
