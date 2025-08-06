  package comparable;

//  2. Develop a Java program which illustrates the usage of Comparator Interface.
  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.Comparator;

  class Employee{

    private  int emp_Id;
    private String emp_name;
    private  double emp_salary;
    private  char grade;
    private  boolean isactive;
    private long accnumber;

    public Employee(int emp_Id, String emp_name, double emp_salary, char grade, boolean isactive, long accnumber) {
        this.emp_Id = emp_Id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.grade = grade;
        this.isactive = isactive;
        this.accnumber = accnumber;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public long getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(long accnumber) {
        this.accnumber = accnumber;
    }

      @Override
      public String toString() {
          return "Employee{" +
                  "emp_Id=" + emp_Id +
                  ", emp_name='" + emp_name + '\'' +
                  ", emp_salary=" + emp_salary +
                  ", grade=" + grade +
                  ", isactive=" + isactive +
                  ", accnumber=" + accnumber +
                  '}';
      }
  }
public class Comparator_main {


    public static void main(String[] args) {
        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(110, "Sathya", 55000.75, 'A', true, 1234567890123456L));
        list1.add(new Employee(102, "Muthu", 45000.25, 'B', false, 2345678901234567L));
        list1.add(new Employee(108, "Santhiya", 60000.00, 'A', true, 3456789012345678L));
        list1.add(new Employee(109, "Arul", 40000.50, 'C', true, 4567890123456789L));
        list1.add(new Employee(105, "Uma", 70000.90, 'B', false, 5678901234567890L));



        System.out.println(list1);

            Collections.sort(list1, new Numbersort());
        System.out.println(list1);

        Collections.sort(list1,new Namesort());
        System.out.println(list1);

    }
}
  class Numbersort implements  Comparator<Employee>{

      @Override
      public int compare(Employee e1, Employee e2) {
          return  e1.getEmp_Id()-e2.getEmp_Id();
      }
  }

  class Namesort implements Comparator<Employee>{

      @Override
      public int compare(Employee e1, Employee e2) {
          return e1.getEmp_name().compareTo(e2.getEmp_name());
      }
  }

