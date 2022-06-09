public class Student {
    private String name;
    private String lastname;
    private String idNum;
    private int age;
    private University university;


    public Student(String name, String lastname, String idNum, int age, University university) {
        this.name = name;
        this.lastname = lastname;
        this.idNum = idNum;
        this.age = age;
        this.university = university;
    }


    @Override
    public String toString() {
        return this.name+" "+this.lastname+" "+this.idNum+" "+this.age+" "+this.university;
    }
}
