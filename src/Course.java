public class Course {
    private String name;
    private String nameIns;
    private String student;

    public Course(String name, String nameIns, String student){
        if (name.length() > 2){
            this.name = name;
        }
        this.nameIns = nameIns;
        this.student = student;

    }
    String getName(){
        return name;
    }
    String getNameIns(){
        return nameIns;
    }
    String getStudent(){
        return student;
    }

    public String student() {
        return student.toString();
    }
}
