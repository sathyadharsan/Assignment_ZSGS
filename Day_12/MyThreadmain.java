



class  MyThread extends Thread{
    @Override
    public void run() {
         for (int i=0;i<5;i++){
             try {

                 System.out.println(getName()+ "message  "+ i);
                 Thread.sleep(500);

                 System.out.println();

             }
             catch (Exception e){
                 System.out.println("handled the exception");
             }

         }
    }
}

public class MyThreadmain{
    public static void main(String[] args) {

    MyThread   t1  =new MyThread();

    MyThread t2= new MyThread();

    t1.setName("first _name");
    t2.setName("Second _name");
    t1.start();
    t2.start();

    }


}
