package chap13.ex1313;

public class Course implements Cloneable{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 9.9
  }

  public Course clone() {
      Course c = new Course(courseName);
      for (int i = 0; i < numberOfStudents; i++) {
        c.addStudent(students[i]);
      }
      return c;
  }
}
