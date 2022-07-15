package course;

public class Course {
    static String name;
    static int ec;



    public void setName(String name) {
        this.name = name;
    }

    public void setEc(int ec) {
        this.ec = ec;
    }

    public Course(String name, int ec) {
        this.name = name;
        this.ec = ec;
    }
    public static String getKurs(){
        return name + ec;

    }


}
