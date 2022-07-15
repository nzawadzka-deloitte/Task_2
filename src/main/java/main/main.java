package main;
import course.Course;
import faculty.Faculty;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
    Course course1 = new Course ("Analiza", 4, 1);
    Course course2 = new Course ( "Algebra", 10, 2);
    List<Course> courses = new ArrayList<>(List.of(course1, course2));
    Faculty faculty1 = new Faculty (1, "Wydział Architektury");
    Faculty faculty2 = new Faculty (2, "Wydział Budownictwa");
    Faculty faculty4 = new Faculty(4, "Wydział Informatyki i Telekomunikacji");
    List<Faculty> faculties = new ArrayList<>(List.of(faculty1,faculty2,faculty4));
    List<String> student1Course = new ArrayList<>(List.of("Analiza","Algebra"));
    List<String> student2Course = new ArrayList<>(List.of("Analiza"));
    Student student1 = new Student ("Natalia", "Zawadzka","F",4, "252706", (ArrayList) student1Course);
    Student student2 = new Student ("Anna", "Nowak", "F", 2, "232893", (ArrayList) student2Course);









    }
}
