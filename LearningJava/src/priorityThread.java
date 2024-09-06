package matrix;
public class priorityThread {
  

public class EvenOddThread {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());

        evenThread.start();
        oddThread.start();
    }

    static class EvenThread implements Runnable {
        public void run() {
            try {
                for (int i = 0;i<=10 ; i += 2) {
                    System.out.println("Even: " + i);
                    Thread.sleep(2000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted.");
            }
        }
    }

    static class OddThread implements Runnable {
        public void run() {
            try {
                for (int i = 1; i<=10; i += 2) {
                    System.out.println("Odd: " + i);
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted.");
            }
        }
    }
}
}
