package shalow_copy;
//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class  Address{
    String city;
    public  Address(String city){
        this.city=city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
class Student implements Cloneable{
    String name;
    Address address;


    public Student(String name,Address address) {
        this.name = name;
        this.address=address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

public class shalow_copy_test {
    public static void main(String[] args) throws CloneNotSupportedException {

         Address add =new Address("Tenkasi");

          Student stu= new Student("sathya",add);



          Student shalow=(Student)  stu.clone();
          
        System.out.println(shalow.name);
        System.out.println(shalow.address);


        stu.name="santhiay";
        stu.address.city="madurai";

        System.out.println("******************");


        System.out.println(shalow.name);


        System.out.println(shalow.address);




    }

}
