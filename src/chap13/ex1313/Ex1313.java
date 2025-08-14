package chap13.ex1313;

import java.util.Arrays;

public class Ex1313 {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics");
        c1.addStudent("John");
        c1.addStudent("Daniel");
        c1.addStudent("James");
        System.out.println(Arrays.toString(c1.getStudents()));
        System.out.println("___");

        Course c2 = c1.clone();
        c2.addStudent("Hanna");
        c2.getStudents()[0] = "Born";
        System.out.println(c2.getCourseName());
        System.out.println(c2.getNumberOfStudents());
        System.out.println(Arrays.toString(c2.getStudents()));
    }
}
