package assign9_1;
//1. Illustrates with an example of using Singleton class.

 class Singleton {

    public  static Object instance;

    private  Singleton(){

    }

    public  static  Object getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
}
public  class Singletone_main{
public static void main(String[]args) {

    System.out.println(
            Singleton.getInstance());
    System.out.println(Singleton.getInstance());

}

        }
