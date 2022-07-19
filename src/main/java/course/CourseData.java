package course;

import java.util.ArrayList;
import java.util.List;

public class CourseData {
    public static List<Course> createData(){
        Course course1 = new Course ("Analiza matematyczna", "4", 1);
        Course course2 = new Course ( "Algebra liniowa", "10", 2);
        Course course3 = new Course ("Miernictwo" , "4", 3);
        List<Course> courses = new ArrayList<>(List.of(course1, course2, course3));
        return courses;
    }
}
