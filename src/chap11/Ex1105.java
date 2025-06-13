package chap11;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex1105 {
    public static void main(String[] args) {
        Course c = new Course("English");
        c.addStudent("John");
        c.addStudent("Lena");
        c.addStudent("Adam");
        System.out.println(Arrays.toString(c.getStudents()));
        System.out.println(c.getNumberOfStudents());
        c.dropStudent("Lena");
        System.out.println(Arrays.toString(c.getStudents()));
        System.out.println(c.getNumberOfStudents());
    }
}

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        // Lưu ý
        // return students.toArray(new String[students.size()]);
        // với kiến thức đã học, nhưng theo chatGPT
        // cái dưới là cách viết phổ biến, an toàn và hiệu quả trong Java hiện đại
        return students.toArray(new String[0]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student)  {
        if (students.contains(student)) {
            students.remove(student);
        } else {
            System.out.println("Student not found");
        }
    }
}
