package multithreading;
// Multithreading using Runnable interface
class A implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Thread A " + i);
            i++;
        }
    }
}

class B implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (i <= 10) {
            System.out.println("Thread B " + i);
            i++;
        }
    }
}

public class Intro {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }
}
