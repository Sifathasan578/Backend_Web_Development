package threading_basics;

public class ThreadState {
    public void createBlockedThread() throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread1 acquired lock...");

                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread2 acquired lock...");
            }
        });

        thread1.start();
        Thread.sleep(1000); // ensure thread1 acquires the lock first
        thread2.start();
        Thread.sleep(1000); // give thread2 a chance to attempt to acquire lock

        System.out.println("Thread2 state: " + thread2.getState()); // Should be blocked
    }

    public void waitingState() throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread1 is going to wait...");
                    lock.wait(); // THREAD ENTERS WAITING STATE
                    System.out.println("Thread1 resumed after notify!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread2 is notifying Thread1...");
                lock.notify(); // wakes up thread1
            }
        });
        thread1.start();
        Thread.sleep(1000); // ensure thread1 starts and waits
        System.out.println("Thread state: " + thread1.getState()); // Should print WAITING
        thread2.start();
    }

    public void TimedWaitState() throws InterruptedException {
        Thread sleepingThread = new Thread(() -> {
            try {
                System.out.println("Thread going to sleep...");
                Thread.sleep(5000); // TIMED_WAITING for 5 seconds
                System.out.println("Thread woke up!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        sleepingThread.start();
// Give the thread time to enter TIMED_WAITING
        Thread.sleep(1000);
// Print the thread state while it is sleeping
        System.out.println("Thread state: " + sleepingThread.getState()); // TIMED_WAITING
    }

    public void terminateState() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
        });
        thread.start();
        Thread.sleep(100);
// Print thread state after it has finished
        System.out.println("Thread state: " + thread.getState()); // TERMINATED
    }
}
