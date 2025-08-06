package Assiagn;

class evenodd{



    public synchronized void oddnumber(){

        for (int i=0;i<=20;i++){
            if (i%2==0){
                System.out.println("print even number"+ i);
            }
        }
    }
    public  synchronized  void evennumber(){
        for (int i=0;i<=20;i++){
            if (i%2!=0){
                System.out.println("printoddnumber"+i);
            }
        }
    }
}

public class Evenoddprintmain {
    public static void main(String[] args) {
        evenodd eo =new evenodd();



        Thread t1 =new Thread(()-> eo.oddnumber());
        Thread t2= new Thread(()->eo.evennumber());
        t1.start();
        t2.start();


    }
}
