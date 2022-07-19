package course;

public class Course {
     String name;
     String ect;
    int courseID;
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
