public class Person {
    String firstname;
    String lastname;
    int age;
    double salary;
    int[] grades;

    @Override
    public String toString() {
        String gr = "";
        for (int x: grades)
            gr += x + ", ";

        return "სახელი: " + firstname + " გვარი: " + lastname+  " ასაკი: " + age + " ხელფასი " +salary
                + " ნიშნები " + gr ;
        //grades[0] + " " + grades[1] +" "+ grades[2] +" "+ grades[3] +" "+ grades[4];


    }
}
