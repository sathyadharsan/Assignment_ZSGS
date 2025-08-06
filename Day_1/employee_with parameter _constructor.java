public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(  empId);
        System.out.println( name);
        System.out.println( department);
        System.out.println( salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", "IT", 50000);
        emp.display();
    }
}
