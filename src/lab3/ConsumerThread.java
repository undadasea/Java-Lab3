package lab3;

public class ConsumerThread extends Thread{
    private int argument;
    private Storage mutex;

    ConsumerThread(int arg, Storage storage){
        mutex = storage;
        argument = arg;
    }

    public void run() {
        System.out.println("consumer runs");

            synchronized (mutex) {
                for (int i = 0; i < argument; i++) {
                    System.out.println(i + " iteration");
                    System.out.println("Thread name: Consumer");
                    System.out.println("Storage = " + mutex.getProduct());
                    mutex.notify();
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}
