import java.util.Arrays;

public class Student {
    String firstname;
    public String lastname;
    protected int age;
    private double salary;
    int[] grades;

    public Student(String firstname, String lastname, int age, double salary, int[] grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

}
