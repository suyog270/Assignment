package Assignment_7;

import Assignment_7.Student;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks1 = {70,65,40,80};
        int[] marks2 = {80,69,78,88};
        int[] marks3 = {79,86,70,90};
        Student std1 = new Student("Ram",17,marks1);
        Student std2 = new Student("Shyam",18,marks2);
        Student std3 = new Student("Hari",17,marks3);


        System.out.println("Enter your name");
        String name = input.next();

        if(name.equals("Ram")){
            std1.getDetails();
        } else if (name.equals("Shyam")) {
            std2.getDetails();
        }
        else{
            std3.getDetails();
        }
    }
}