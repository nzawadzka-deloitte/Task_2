package faculty;

public class Faculty {
    int facultyNumber;
    String facultyName;


    public Faculty(int facultyNumber, String facultyName) {
        this.facultyNumber = facultyNumber;
        this.facultyName = facultyName;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
