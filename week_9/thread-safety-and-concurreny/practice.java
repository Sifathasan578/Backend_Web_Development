package thread_safety_and_concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*concurrency vs parallelism: interview question
        */

        /*// race condition
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

        // interview question: optimistic locking and pessimistic locking*/

        /*// Executor Framework
        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("Task executed")); // gave a runnable*/

        // Fixed threadpool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is running by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // try with resource likhle shutdown likhte hobe nah

        // Virtual Threads, need more understanding

        // Creating java virtual thread
        Runnable runnable = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Index: " + i);
            }
        };

        Thread vThread = Thread.ofVirtual().start(runnable);
        vThread.join();
        /*If you do not want the virtual thread to start immediately, you can use the unstarted() method instead. Here is an example of
creating an unstarted virtual thread:*/

        Thread vThreadUnstarted = Thread.ofVirtual().unstarted(runnable);
        vThreadUnstarted.start();

        /*ExecutorService Using Virtual Threads
        It is possible to create a Java ExecutorService that uses virtual threads internally. Example:*/

        try (ExecutorService executor2 = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                executor2.submit(() -> System.out.println("Task " + taskId + " running in " + Thread.currentThread()));
            }
        }
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
