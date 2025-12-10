package thread_safety_and_concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*concurrency vs parallelism: interview question
        */

        // race condition
        Counter counter = new Counter();

        Runnable counterTask = () -> { // thread with anonymous class
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + ", Count = " + counter.getCount());
                counter.increment();
            }
//            counter.increment(); // 2 hobe
        };

        Thread t1 = new Thread(counterTask);
        Thread t2 = new Thread(counterTask);

        t1.start();
        t2.start();

        t1.join(); //
        t2.join(); // ensure kore j duita thread er kaaz complete holei porer instructions gula kaaz korbe!

        System.out.println("Expected: 2000");
        System.out.println("Actual: " + counter.getCount());

        // atomic?

        // interview question: optimistic locking and pessimistic locking

    }
}


package thread_safety_and_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/*public class Counter {
//    private int count = 0;
    private AtomicInteger count = new AtomicInteger(0);

    *//*public void increment() {
        count++;
    }*//*
    // thread safe increment
    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
//        return count;
        return count.get();
    }
}*/

// using synchronize
/*
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++; // thread safe
    }

    public synchronized int getCount() {
        return count;
    }
}
*/

// synchronized block
public class Counter {
    private int count = 0;
    private final Object lock = new Object(); // Lock object

    //
    public void increment() {
        synchronized (lock) {
            count++; // thread safe
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
