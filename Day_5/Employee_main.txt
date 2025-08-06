package emp;

//3. Create a Java application to manage employees in a company. Define a base class Employee with a method
//        calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
//        method based on their working type


class  Employee{

    private  String emp_name;
    private  int salary;
    public Employee(String emp_name){
 this.emp_name=emp_name;
    }
    public  int calculateSalary(){
        return  salary;

    }
}

class FullTimeEmployee extends Employee{

    private    int FullTimeEmployee_salary;

    public FullTimeEmployee( String emp_name,int fullTimeEmployee_salary) {
        super(emp_name);
        FullTimeEmployee_salary = fullTimeEmployee_salary;
    }

    @Override
    public int calculateSalary() {
        return FullTimeEmployee_salary;
    }
}
class PartTimeEmployee  extends  Employee{
    private int PartTimeEmployee_salary;

    public PartTimeEmployee(String emp_name, int partTimeEmployee_salary) {
        super(emp_name);
        PartTimeEmployee_salary = partTimeEmployee_salary;
    }

    @Override
    public int calculateSalary() {
        return PartTimeEmployee_salary;
    }
}
public class Employee_main{
    public static void main(String[] args) {
    Employee emp=     new Employee("sathya");
        emp.calculateSalary();
     FullTimeEmployee fullTimeEmployee=    new FullTimeEmployee("sathya",1000);
        System.out.println( " fullTimeEmployee_salary    "+fullTimeEmployee.calculateSalary());

     PartTimeEmployee partTimeEmployee=new PartTimeEmployee("sathya",10000);
        System.out.println(      "partTimeEmployee      "  +partTimeEmployee.calculateSalary());
    }





}

