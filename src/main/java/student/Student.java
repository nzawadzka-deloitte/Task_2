package student;

import course.Course;
import faculty.Faculty;

import java.util.List;


public class Student {

     String name;
     String lastname;
     String sex;
     Faculty faculty;
     String studentID;
     Course course;

   public Student(String name, String lastname, String sex, Faculty faculty, String studentID, Course course) {
      this.name = name;
      this.lastname = lastname;
      this.sex = sex;
      this.faculty = faculty;
      this.studentID = studentID;
      this.course = course;
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

    public String getFacultyName(){
       return faculty.getFacultyName();
    }
    public String getStudentID() {
       return studentID;
    }

    public Course getCourse() {
       return course;
    }
    public String getCourseName(){
       return course.getName();
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

    public void setCourses(Course course) {
        this.course = course;
    }
}
