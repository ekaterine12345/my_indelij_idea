public class PartTime extends  Employee{
    private int dayNumber=30;
    private int daySalary=500;


    @Override
    public double getSalary() {
        return daySalary*dayNumber;
    }

    @Override
    public String toString() {
        return this.name+" "+this.lastname+" "+this.idNum+" "+this.age+" "+
               this.dayNumber+" "+this.daySalary+" "+daySalary*dayNumber;

    }
}
