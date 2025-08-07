package chap13.ex1313;

import java.util.Arrays;

public class Ex1313 {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics");
        c1.addStudent("John");
        c1.addStudent("Daniel");
        c1.addStudent("James");

        Course c2 = c1.clone();
        System.out.println(c2.getCourseName());
        System.out.println(c2.getNumberOfStudents());
        System.out.println(Arrays.toString(c2.getStudents()));
    }
}
