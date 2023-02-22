public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    private int yearLevel;
    static int studentCount;

    public Student(String f, String l,  int a, int y){
        firstName=f;
        lastName=l;
        age=a;
        yearLevel=y;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
