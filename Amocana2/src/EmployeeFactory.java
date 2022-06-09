public class EmployeeFactory {

     public Employee getEmployee(Boolean b)
    {
        if (b) return new FullTime();
        else
        if (!b) return new PartTime();

        return null;
    }
}
