@Deprecated
public class Person {
    private String name;
    private String lastname;
    private String idNum;


    public Person(String name, String lastname, String idNum) {
        this.name = name;
        this.lastname = lastname;
        this.idNum = idNum;
    }


    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}
