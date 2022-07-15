package course;

public class Course {
    static String name;
    static int ec;

    static int courseID;



    public void setName(String name) {
        this.name = name;
    }

    public void setEc(int ec) {
        this.ec = ec;
    }

    public Course(String name, int ec, int courseID) {
        this.name = name;
        this.ec = ec;
        this.courseID = courseID;
    }
    public static String getKurs(){
        return name + ec;

    }


}
