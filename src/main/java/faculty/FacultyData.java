package course;

import faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class FacultyData {
    public static List<Faculty> createData(){
        Faculty faculty1 = new Faculty (1, "Wydział Architektury");
        Faculty faculty2 = new Faculty (2, "Wydział Budownictwa");
        Faculty faculty4 = new Faculty(4, "Wydział Informatyki i Telekomunikacji");
        List<Faculty> faculties = new ArrayList<>(List.of(faculty1,faculty2,faculty4));
        return faculties;

    }

}
