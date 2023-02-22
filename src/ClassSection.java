import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students=new ArrayList<Student>();

    public ClassSection(String s, int c, int y){
        subject=s;
        capacity=c;
        yearLevel=y;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearLevel() {

        return yearLevel;
    }

    public int getCapacity() {

        return capacity;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSubject(String s){this.subject=s;}
    public void addStudent(Student student) {
        if(!students.contains(student))
       students.add(student.getId(),student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public boolean ifStudentEnrolled(Student student) {
        return students.contains(student);
    }

    public String toString(){
        return "ClassSection{subject='"+subject+"', capacity="+capacity+", students=[]}";
    }
}
