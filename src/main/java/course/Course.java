package course;

import student.Student;
import student.StudentData;

import java.util.List;
public class Course {

     String name;
     String ect;
     int courseID;
     int numberOfStudents;


    public int getNumberOfStudents() {
        numberOfStudents=0;
        List<Student> students = StudentData.createData();
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getCourseName().equals(name)){
                numberOfStudents++;
            }
        }
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getEct() {
        return ect;
    }
    public int getCourseID() {
        return courseID;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEc(String ect) {
        this.ect = ect;
    }

    public Course(String name, String ect, int courseID) {
        this.name = name;
        this.ect = ect;
        this.courseID = courseID;

    }

}
