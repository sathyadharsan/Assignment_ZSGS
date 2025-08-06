package Assiagn;
//        4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments
//        the counter 1000 times. Use synchronization to avoid race conditions and display the final value.

class Sharecounter{
   private int count=0;
    public  synchronized void incrementcount(){
        count++;


    }
    public  int getcount(){
        return count;
    }


}


class MyRunnable implements  Runnable{

Sharecounter sharecounter ;

public  MyRunnable(Sharecounter sharecounter){
    this.sharecounter=sharecounter;
}
    @Override
    public void run() {

        for (int i = 0; i <1000 ; i++) {
            sharecounter.incrementcount();


        }


    }
}


public class Sharedcountermain {
    public static void main(String[] args) throws InterruptedException {


        Sharecounter sharecounter= new Sharecounter();

      MyRunnable myRunnable = new MyRunnable(sharecounter);

      Thread t1= new Thread(myRunnable);
      Thread t2= new Thread(myRunnable);
      Thread t3= new Thread(myRunnable);
      t1.start();
      t2.start();
      t3.start();

      t1.join();
      t2.join();
      t3.join();


       System.out.println(sharecounter.getcount());



    }
}
