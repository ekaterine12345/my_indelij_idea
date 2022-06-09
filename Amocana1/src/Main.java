import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        University university =University.getInstance();

        String name, lastname, idNum;
        int age;

        name=sc.next();
        lastname=sc.next();
        idNum=sc.next();
        age=sc.nextInt();

        Student student=new Student(name,lastname,idNum, age,university);

        System.out.println(student);
    }
}
