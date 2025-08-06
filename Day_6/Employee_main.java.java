package Assignment6;

//3. Design a class`Employee with private data members: employee ID, name, designation, department,
//        and monthly salary. Use proper getter
//        and setter methods to access and update these fields. Add a method to
//        calculate and return the annual salary of the employee.

class  Employee{
    private  int employee_ID;
    private  String name;
    private String designation;
    private String department;
    private double salary;

    public Employee(int employee_ID, String name, String designation, String department, double salary) {
        this.employee_ID = employee_ID;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  double getanuvalsalary(){
        return salary*12;
    }
}

public class Employee_main {
    public static void main(String[] args) {


       Employee employee =new Employee();
       employee.setEmployee_ID(101);
       employee.setName("sathya");
       employee.setDepartment("IT");
       employee.setDesignation("Software Engineer");
       employee.setSalary(40000);
        System.out.println(employee.getanuvalsalary());
        System.out.println(employee.getSalary());
    }
}
