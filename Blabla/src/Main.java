import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World <3");
        Scanner scanner = new Scanner(System.in);

      //  int x=scanner.nextInt();

       // System.out.println("hi "+x);

        Person person = new Person();
        person.firstname = "Ekaterine";
        person.lastname = "Gurgenidze";
        person.age = 19;
        person.salary = 3500;
        person.grades = new int[]{100, 100, 99, 97, 100};

        System.out.println(person.firstname);
        System.out.println(person);

        int[] array = {100, 92, 97};

//        for (int x:  array)
//            System.out.println(x);

        Student student = new Student("Kato", "Gurg", 19, 3550, array);
        System.out.println(student);

    }
}
