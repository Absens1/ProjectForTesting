package lesson3;

import java.util.concurrent.SynchronousQueue;

public class PingPong {

    private SynchronousQueue<Integer> q = new SynchronousQueue<>();
    private Thread t1 = new Thread() {
        @Override
        public void run() {
            while (true) {
                super.run();
                try {
                    Thread.sleep(1000);
                    System.out.println("Ping");
                    q.put(1);
                    q.put(2);
                } catch (Exception e) { }
            }
        }
    };

    private Thread t2 = new Thread() {
        @Override
        public void run() {
            while (true) {
                super.run();
                try {
                    Thread.sleep(1000);
                    q.take();
                    System.out.println("Pong");
                    q.take();
                } catch (Exception e) { }
            }
        }
    };

    public static void main(String[] args) {
        PingPong p = new PingPong();
        p.t1.start();
        p.t2.start();
    }

}