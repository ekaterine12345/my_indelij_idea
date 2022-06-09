public abstract class Employee {

  public  abstract double getSalary();

  protected String name="ekaterine";
  protected String lastname="gurgenidze";
  protected String idNum="1010101";
  protected int age=17;


  @Override
  public String toString() {
    return this.name+" "+this.lastname+" "+this.idNum+" "+this.age;
  }
}
