package student;

import java.util.ArrayList;



public class Student {

     String name;
     String lastname;
     String sex;
     int facultyNumber;
     String studentID;
     ArrayList<String> courseList = new ArrayList<String>();

   public Student(String name, String lastname, String sex, int facultyNumber, String studentID, ArrayList courseList) {
      this.name = name;
      this.lastname = lastname;
      this.sex = sex;
      this.facultyNumber = facultyNumber;
      this.studentID = studentID;
      this.courseList = courseList;
   }



   public  String getName() {
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

    public  ArrayList<String> getList() {
       return courseList;
    }

    public  String getStudent(){
       return name + " " + lastname + " " + sex + " " + facultyNumber + " " + studentID + courseList;
    }



}
