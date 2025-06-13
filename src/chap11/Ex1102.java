package chap11;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ex1102 {
    public static void main(String[] args) {
        // Test Student
        Student st1 = new Student("John");
        st1.setClassStatus(Student.FRESHMAN);
        st1.setAddress("19 Kim Lien");
        st1.setPhoneNr("12317231823");
        st1.setEmail("john.lenon@gmail.com");
        System.out.println(st1.toString());
        System.out.println();

        // Test Faculty
        Faculty fc1 = new Faculty("James");
        fc1.setAddress("635 Vu Tong Phan");
        fc1.setPhoneNr("21381273");
        fc1.setEmail("noTideHunter_oke@gmail.com");
        fc1.setRank("Professor");
        System.out.println(fc1.toString());
        System.out.println();

        // Test Staff
        Staff stf1 = new Staff("Nobita");
        stf1.setTitle("Security Guard");
        System.out.println(stf1.toString());
        System.out.println();

        // Another tests
        System.out.println(fc1.getDateHired());

    }
}

class Person {
    // name, address, phoneNr, email
    private String name;
    private String address;
    private String phoneNr;
    private String email;

    public Person () {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNr() {
        return this.phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return  "Name        : " + this.name +
                "\nAddress     : " + this.address +
                "\nPhone Nr    : " + this.phoneNr +
                "\nEmail       : " + this.email;
    }
}

class Student extends Person {
    // class_status : Freshman , sophomore, junior , senior. Sau này dùng enum
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    private int classStatus;

    public Student(String name) {
        super(name);
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        switch (classStatus) {
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "UNKNOWN_CLASS";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Status      : " + getClassStatus();
    }
}

class Employee extends Person {
    // Office , salary, date hired
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
    }

    public Employee(String name) {
        super(name);
        dateHired = new MyDate();
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(int year, int month, int day) {
        dateHired.setDate(year, month, day);
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired.toString();
    }
}

class Faculty extends Employee {
    // Nhan vien tham gia giang day
    private int officeHour;
    private String rank;
    private long createdTimeMillis;

    public Faculty(String name) {
        super(name);
        this.createdTimeMillis = System.currentTimeMillis();
    }

    public int getOfficeHour() {
        long now = System.currentTimeMillis();
        long elapsedTimeMillis = now - createdTimeMillis;
        return (int) (elapsedTimeMillis / (1000 * 60 * 60));
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() +
                "\nOffice Hour : " + officeHour +
                "\nRank        : " + rank;
    }
}

class Staff extends Employee {
    private String title;

    Staff (String name) {
        super(name);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                getTitle();
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        setDate(System.currentTimeMillis());
    }

    public MyDate(long timeInMillis) {
        setDate(timeInMillis);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapseTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapseTime);

        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1; // Tháng bắt đầu từ 0
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }
}