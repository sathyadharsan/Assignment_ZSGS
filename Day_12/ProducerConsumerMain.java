package Assiagn;

import java.util.LinkedList;

class ProducerConsumer {
    int maxLimit = 5;
    LinkedList<Integer> buffer = new LinkedList<>();

    public synchronized void produceThread(int value) throws InterruptedException {
        while (buffer.size() == maxLimit) {
            System.out.println("buffer full");
            wait();
        }
        buffer.add(value);
        System.out.println("Produced "+ value);
        notify();
    }

    public synchronized void consumeThread() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("buffer empty");
            wait();
        }
        int removed = buffer.removeFirst();
        System.out.println("Consumed" + removed);
        notify();
    }
}

class Producer extends Thread {
    ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        int value = 1;
        try {
            while (true) {
                pc.produceThread(value++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            while (true) {
                pc.consumeThread();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerMain {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);

        producer.start();
        consumer.start();
    }
}
