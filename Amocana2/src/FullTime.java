public class FullTime extends Employee {

    private int mySalary=9000;

    @Override
    public double getSalary() {
        return mySalary;
    }

    @Override
    public String toString() {
        return this.name+" "+this.lastname+" "+this.idNum+" "+this.age+" "+mySalary;
    }
}
