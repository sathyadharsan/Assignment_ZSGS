
//‌
//        2. Write a Java program to create a thread using the Runnable interface.
//        --->Create a class TaskRunner that implements Runnable.
//        --->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
//        --->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
//        --->The console should reflect the concurrent execution of both tasks.
       // ‌

class  TaskRunner implements  Runnable{

    String name;

    TaskRunner(String name){
        this.name=name;
    }


    @Override
    public void run() {

        for (int i = 0; i <=10; i++) {
            System.out.println("TaskRunner "+ Thread.currentThread().getName()  +"  " +   name+"  "+i);

            try{

                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                System.out.println("interupted");

            }

        }


    }
}

public class MyRunablemain {

    public static void main(String[] args) {

        TaskRunner my  =new TaskRunner("sathya");

        TaskRunner my1=   new TaskRunner("muthu");

         Thread t1= new Thread(my);
         Thread t2= new Thread(my1);
         t1.setName("myfirstThread");
  t2.setName("mysecondThread");

         t1.start();
         t2.start();

    }
}
