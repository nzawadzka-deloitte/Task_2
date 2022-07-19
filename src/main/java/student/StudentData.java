package student;

import course.Course;
import faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<Student> createData(){
        Course course1 = new Course ("Analiza matematyczna", "4", 1);
        Course course2 = new Course ( "Algebra liniowa", "10", 2);
        Course course3 = new Course ("Miernictwo" , "4", 3);
        Faculty faculty1 = new Faculty (1, "Wydział Architektury");
        Faculty faculty2 = new Faculty (2, "Wydział Budownictwa");
        Student student1 = new Student ("Natalia", "Zawadzka","F",faculty1, "252706",course1 );
        Student student2 = new Student ("Anna", "Nowak", "F", faculty1, "232893",course1 );
        Student student3 = new Student("Asia", "Zawadzka", "F", faculty2, "243563", course2 );
        Student student4 = new Student("Asia", "Zawadzka", "F", faculty2, "243563", course1 );
        List<Student> students = new ArrayList<>(List.of(student1,student2, student3,student4));

        return students;

    }
}