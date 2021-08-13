package lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class CounterTest implements Runnable {
    static int counter = 1;

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void incrementCounter() {
        counterLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": " + counter);
            counter++;
        } finally {
            counterLock.unlock();
        }
    }

    @Override
    public void run() {
        while(counter < 1000) {
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        CounterTest te = new CounterTest();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.start();
        thread2.start();
    }
}