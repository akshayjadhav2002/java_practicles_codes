import java.time.chrono.ThaiBuddhistEra;

public class CreateThread extends Thread {

    public void run() {
        System.out.println(getName());
        System.out.println(currentThread());
        System.out.println(getId());
        for(int i =0;i<10;i++){
            System.out.println("IN run");
        }
    }

    public static void main(String args []) throws InterruptedException {
        System.out.println("Start Main");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
        CreateThread ct = new CreateThread();
        ct.start();
        CreateThread ct1 = new CreateThread();
        ct1.start();
        CreateThread ct2 = new CreateThread();
        ct2.start();
        CreateThread ct3 = new CreateThread();
        ct3.start();
        for(int i =0;i<5;i++){
            System.out.println("IN main");
        }
        System.out.println("End Main");
    }

}
