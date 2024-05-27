class A implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class B implements Runnable{
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class MainThread {
    public static void main(String[] args) throws Exception {
        Runnable a = new A();
        Runnable b = new B();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        Thread.sleep(3000);
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Hello World");
    }
}
