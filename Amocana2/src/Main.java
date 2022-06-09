public class Main {
    public static void main(String[] args) {

    EmployeeFactory employeeFactory=new EmployeeFactory();

        Employee  employee1=employeeFactory.getEmployee(true);
        employee1.getSalary();


        Employee employee2=employeeFactory.getEmployee(false);
        employee2.getSalary();


        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
