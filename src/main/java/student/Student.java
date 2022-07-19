package student;

import course.Course;
import faculty.Faculty;

import java.util.ArrayList;
import java.util.List;


public class Student {

     String name;
     String lastname;
     String sex;
     Faculty faculty;
     String studentID;
     List<Course> courses;

   public Student(String name, String lastname, String sex, Faculty faculty, String studentID, List<Course> courses) {
      this.name = name;
      this.lastname = lastname;
      this.sex = sex;
      this.faculty = faculty;
      this.studentID = studentID;
      this.courses = courses;
   }





    public String getLastname() {
       return lastname;
    }

    public String getSex() {
       return sex;
    }

    public Faculty getFaculty() {
       return faculty;
    }

    public String getStudentID() {
       return studentID;
    }

    public List<Course> getCourses() {
       return courses;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
