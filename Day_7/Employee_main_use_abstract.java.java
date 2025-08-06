package assign7_2;




//Create a Java application to manage employees in a company. Define an abstract class Employee
//        with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee
//        that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism
//        by calling calculateSalary() on different types of employees using the Employee reference.
 abstract class   Employee {

    public abstract void calculateSalary(int salary);
}

class  FullTimeEmployee extends  Employee{

     private  int salary;

    @Override
    public void calculateSalary(int salary) {
        System.out.println("fulltimeemployee"+salary);

    }
}


class PartTimeEmployee extends Employee {
private  int salary;
    @Override
    public void calculateSalary(int salary) {
        System.out.println("parttimremployee"+ salary);

    }
}

class  Office{
     private  Employee employee;
     public Office(Employee  employee)
     {
         this.employee=employee;
     }


     public  void salarycredit(int salary){
         employee.calculateSalary(salary);

     }
}


public  class  Employee_main_use_abstract{
    public static void main(String[] args) {
        Employee emp =new PartTimeEmployee();
        Employee emp1= new FullTimeEmployee();

        emp.calculateSalary(10000);
        emp1.calculateSalary(20000);
//       Office office  = new Office(emp);
//       office.salarycredit(20000);


    }


}





