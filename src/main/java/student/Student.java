package student;

import course.Course;

import java.util.ArrayList;

 class Student {

    static String name;
    static String lastname;
    static String sex;
    static int facultyNumber;
    static String studentID;
    static ArrayList<Course> list = new ArrayList<Course>();


    public static String getName() {
       return name+lastname+facultyNumber;
    }

    public String getLastname() {
       return lastname;
    }

    public String getSex() {
       return sex;
    }

    public int getFacultyNumber() {
       return facultyNumber;
    }

    public String getStudentID() {
       return studentID;
    }

    public static ArrayList<Course> getList() {
       return list;
    }

    public static String getStudent(){
       return name + " " + lastname + " " + sex + " " + facultyNumber + studentID + list;
    }
 }
