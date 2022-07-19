package student;

import faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<Student> createData(){
        List<String> student1Course = new ArrayList<>(List.of("Analiza","Algebra"));
        List<String> student2Course = new ArrayList<>(List.of("Analiza"));
        Faculty faculty1 = new Faculty (1, "Wydział Architektury");
        Faculty faculty2 = new Faculty (2, "Wydział Budownictwa");
        Faculty faculty4 = new Faculty(4, "Wydział Informatyki i Telekomunikacji");
        Student student1 = new Student ("Natalia", "Zawadzka","F",faculty1, "252706", (ArrayList) student1Course);
        Student student2 = new Student ("Anna", "Nowak", "F", faculty1, "232893", (ArrayList) student2Course);
        Student student3 = new Student("Asia", "Zawadzka", "F", faculty2, "243563", (ArrayList) student1Course );
        List<Student> students = new ArrayList<>(List.of(student1,student2, student3));

        return students;
    }
}
