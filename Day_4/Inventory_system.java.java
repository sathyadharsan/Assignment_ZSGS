package assign;

// 6)Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
//        Create two classes:
//        ---Store
//        ---Product
//        Requirements:
//        The Store class should have:
//        a. storeName and storeLocation as static variables since they are common to all products in the store.
//        b. A static method setStoreDetails(String name, String location) to initialize the static variables.
//        c. A static method displayStoreDetails() to print store details.
//        d. A list to maintain multiple Product objects (i.e., the store contains many products).
//        e. A method addProduct(Product product) to add products to the store.
//        f. A method displayAllProducts() to display details of all products.
//        The Product class should have:
//        a. Product ID, name, price, and quantity as instance variables.
//        b. A constructor to initialize these fields.
//        c. A method displayProduct() to show product details.
//        Task: Implement the above classes and demonstrate their use in the main() method by:
//        a. Setting store details once.
//        b. Creating multiple product objects.
//        c. Adding them to the store.
//        d. Displaying store and product information.
//        Also Check how many .class files are generated.
import java.util.ArrayList;

class  Store{
    public  static String store_Name;
    public  static String storeLocation ;
    public ArrayList<Product> productArrayList;



    public static void setStoreDetails(String store_Name,String storeLocation) {
        Store.store_Name = store_Name;
        Store.storeLocation=storeLocation;

    }
    public  static void displayStoreDetails(){
        System.out.println(store_Name);
        System.out.println(storeLocation);
    }
    public  void addproduct(  ArrayList<Product> productArrayList ){
        this.productArrayList=productArrayList;

    }

    public  void displayAllProducts(){
        for (Product p1:productArrayList) {
            System.out.println(p1);
        }

    }

}

class  Product{
    private  int product_ID;
    private  String name;
    private  int price;
    private  int quantity;

    public Product(int product_ID, String name,int price, int quantity) {
        this.product_ID = product_ID;
        this.name=name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public   void displayAllProducts(){
        System.out.println(product_ID);
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);

    }

    @Override
    public String toString() {
        return "Product{" +
                "product_ID=" + product_ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

//    Implement the above classes and demonstrate their use in the main() method by:
//        a. Setting store details once.
//        b. Creating multiple product objects.
//        c. Adding them to the store.
//        d. Displaying store and product information.
//        Also Check how many .class files are generated.


public class Inventory_system {
    public static void main(String[] args) {

        Store.setStoreDetails("Aayan  Fruit Store","Tenkasi");

        Store store= new Store();


       ArrayList<Product>  products =new ArrayList<>();
       Product product1 =new Product(1,"banana",50,5);
        Product product2 =new Product(2,"mango",70,6);
        Product product3 =new Product(3,"orange",80,7);
        products.add(product1);
        products.add(product2);
        products.add(product3);


        store.addproduct(products);

        Store.displayStoreDetails();
        store.displayAllProducts();





    }
}
