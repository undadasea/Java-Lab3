package lab3;

public class ProducerThread extends Thread {
    private int argument;
    private Storage mutex;
    ProducerThread(int arg, Storage storage){
        argument = arg;
        mutex = storage;
    }

    public void run(){
        System.out.println("producer runs");
        //for (int i = 0; i < argument; i++) {
            synchronized (mutex) {
                for (int j = 0; j < argument; j++) {
                    mutex.addProduct();
                    System.out.println("Thread name: producer");
                    System.out.println("Storage = " + mutex.getProduct());
                    try{
                        mutex.wait();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    mutex.notify();
                }

            }
        //}
    }
}
