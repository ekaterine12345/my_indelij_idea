import java.util.Scanner;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name,lastname,idNum;

        name=sc.next();
        lastname=sc.next();
        idNum=sc.next();


        Person person=new Person(name,lastname,idNum);


        System.out.println(person);

    }
}
