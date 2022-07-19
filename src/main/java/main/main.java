package main;
import course.Course;
import course.CourseData;
import course.FacultyData;
import faculty.Faculty;
import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Course> courses = CourseData.createData();
        List<Faculty> faculties = FacultyData.createData();

    List<String> student1Course = new ArrayList<>(List.of("Analiza","Algebra"));
    List<String> student2Course = new ArrayList<>(List.of("Analiza"));
    Student student1 = new Student ("Natalia", "Zawadzka","F",4, "252706", (ArrayList) student1Course);
    Student student2 = new Student ("Anna", "Nowak", "F", 2, "232893", (ArrayList) student2Course);
    List<Student> students = new ArrayList<>(List.of(student1,student2));

    //filtr
    List<Faculty> facultyName = faculties.stream()
            .filter(faculty -> faculty.getFacultyName().equals("Wydział Budownictwa"))
            .collect(Collectors.toList());
    facultyName.forEach(faculty -> System.out.println("Faculty number: " + faculty.getFacultyNumber() + " "
            +"Faculty name: " + faculty.getFacultyName()));

    List<Course> ect = courses.stream()
            .filter(course -> course.getEct().equals("4"))
            .collect(Collectors.toList());
    ect.forEach(course -> System.out.println("Cours: " + course.getName() + " " + "Ect :" + course.getEct() + " " + "ID: " +
            course.getCourseID()));











    }
}
