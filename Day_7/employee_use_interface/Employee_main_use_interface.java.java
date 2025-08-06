package assign_7_4;


//4. Create a Java application to manage employees in a company. Define an Interface Employee
//        \with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override
//        calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary()
//        on different types of employees using the Employee reference.
//        ?



class FullTimeEmployee implements  Employee{

    @Override
    public double calculateSalary() {
        return 10000;
    }
}


class PartTimeEmployee implements  Employee{
    @Override
    public double calculateSalary() {
        return 20000;
    }
}

public class Employee_main_use_interface {
    public static void main(String[] args) {
         Employee  full_emp= new FullTimeEmployee();
         Employee part_emp = new PartTimeEmployee();

         full_emp.calculateSalary();
         part_emp.calculateSalary();
        System.out.println(part_emp.calculateSalary());
        System.out.println(full_emp.calculateSalary());

    }
}
