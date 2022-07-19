package main;
import course.Course;
import course.CourseData;
import course.FacultyData;
import faculty.Faculty;
import student.Student;
import student.StudentData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Course> courses = CourseData.createData();
        List<Faculty> faculties = FacultyData.createData();
        List<Student> students = StudentData.createData();

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

    //Map
        students.stream()
                .map(student -> student.getFaculty().getFacultyNumber())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //max
        Student maxCourses = students.stream()
                .max(Comparator.comparing(student -> student.getCourses().get(0).getNumberOfStudents()))
                .get();
        System.out.println("Number of students: "+maxCourses.getCourses().get(0).getNumberOfStudents());

        //GroupingBy
        var gruopBySex = students.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.mapping(Student::getStudentID,Collectors.toList())));
        System.out.println(gruopBySex);



    }


}
