// File: CloneWithCloneable.java

class Student implements Cloneable {
    String name;
    int rollNo;
    String department;

    Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneWithCloneable {
    public static void main(String[] args) {
        Student s1 = new Student("Sathya", 101, "IT");

        try {
            Student s2 = (Student) s1.clone();
           
            System.out.println( s1.name + ", " + s1.rollNo + ", " + s1.department);
            System.out.println( s2.name + ", " + s2.rollNo + ", " + s2.department);
        } catch (CloneNotSupportedException e) {
            System.out.println("clonenotsupportexception" + e);
        }
    }
}
