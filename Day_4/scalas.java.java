package assign;

//5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon
//
//        inheriting the Shape class with the same method that prints "Polygon is a shape". Create
//        two other classes named Rectangle and Triangle
//
//        having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon"
//        respectively. Again, make another class named Square
//
//        having the same method which prints "Square is a rectangle".
//
//        Now, try calling the method by the object of each of these classes.






class  Shape{

    public  void shape_methods(){
        System.out.println("Thi is  a shape");
    }

}
class Polygon extends  Shape{
    public  void  shape_methods(){
        System.out.println("Polygon is a shape");
    }
}

class  Rectangle extends  Polygon{

    public void shape_methods() {
        System.out.println("Rectangle is a polygon");
    }
}

class  Triangle extends  Polygon{

    public void shape_methods() {
        System.out.println(" Triangle is a polygon");
    }

}
class  Square extends  Rectangle{
    public void shape_methods() {
        System.out.println(" Square is a rectangle");
    }

}


public class scalas {
    public static void main(String[] args) {
        Shape shape= new Square();
        shape.shape_methods();
        Polygon polygon= new Polygon();
        polygon.shape_methods();
        Rectangle rectangle= new Rectangle();
        rectangle.shape_methods();
        Triangle triangle= new Triangle();
        triangle.shape_methods();
        Square square =new Square();
        square.shape_methods();


    }
}
