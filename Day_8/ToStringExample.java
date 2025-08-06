//7. Develop a Java program to illustrate the usage of toString() method.

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return "Student[rollNo=" + rollNo + ", name=" + name + "]";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Student s = new Student(101, "Sathya");
        System.out.println(s); // internally calls s.toString()
    }
}
