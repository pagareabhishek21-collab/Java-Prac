class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread 1 Interrupted");
            }
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread 2 - Count: " + j);
            try {
                Thread.sleep(700); // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread 2 Interrupted");
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 runnable = new MyThread2();
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        System.out.println("Main thread ends...");
    }
}
