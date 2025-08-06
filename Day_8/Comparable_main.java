package comparable;
//3. Develop a Java program which illustrates the usage of Comparable Interface.
import java.util.ArrayList;
import java.util.Collections;

class Student implements  Comparable<Student>{

    private  int role_num;
    private  double salary;
    private    String name;



    public Student(int role_num, String name,double salary) {
        this.role_num = role_num;
        this.name = name;
        this.salary =salary;
    }



    @Override
    public String toString() {
        return "Student{" +
                "role_num=" + role_num +
                ", name='" + name + '\'' +
                ",salary="+salary+
                '}';
    }


    @Override
    public int compareTo(Student s) {
        return this.role_num-s.role_num;
    }
}


public  class  Comparable_main{
    public static void main(String[] args) {

       ArrayList<Student> list  =new ArrayList<>();

       list.add(new Student(101,"satha",40000));
       list.add(new Student(312,"muthu",50000));
       list.add(new Student(16,"santhiya",60000));
        Collections.sort(list);



        System.out.println(list);


    }

}

