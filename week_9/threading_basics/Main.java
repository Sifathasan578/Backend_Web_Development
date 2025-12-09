package threading_basics;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread = new Thread();
        thread.start();*/

        /*MyThread myThread = new MyThread();
        myThread.start();*/

        /*// or this way:
        MyThread myThread = new MyThread() { // Anonymous Clas
            public void run() {
                System.out.println("MyThread running");
            }
        };
        myThread.start();*/

        /*Runnable myRunnable = new Runnable() { // Anonymous Implementation
            public void run() {
                System.out.println("Runnable running");
            }
        };

        Runnable runnable =
                () -> {
                    System.out.println("Lambda runnable running");
                };

        Thread thread = new Thread(new MyRunnable());
        thread.start();*/

        /*// Starting a thread using runnable
        Runnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);
        //thread.start();
        thread.run();
        Thread thread1 = new Thread(runnable);
        //thread1.start();
        thread1.run();
        Thread thread2 = new Thread(runnable);
        //thread2.start();
        thread2.run();
        // reduces duplicates when using runnable + threading*/

        /*// Passing runnable:
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // runnable er moddhe getName nai
                System.out.println("Name of current thread: " + thread.currentThread().getName());
            }
        }, "Thread-1");

        thread1.start();
        System.out.println(thread1.getName()); //  thread a exist kore, not runnable

        System.out.println("Main thread has been started...");*/

        /*Thread thread = Thread.currentThread();
        String threadName = thread.getName();

        // thread has no ordering */

        /*// Naming thread
        Thread thread1 = new Thread("Thread-1") { // constructor create korar shomoy thread name diye dite hoy!
            @Override
            public void run() {
                System.out.println(getName() + " is running"); // getting thread name
                System.out.println("Current thread name: " + Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread1.start();

        System.out.println("Main thread has been started...");
        Thread.sleep(2000);*/

        /*// New State
        Thread thread = new Thread(() -> {});
        System.out.println("Thread state: " + thread.getState());

        // Runnable state
        thread.start();
        System.out.println("Thread state: " + thread.getState());

        // Blocked or Non-runnable*/

        ThreadState threadState = new ThreadState();

        threadState.createBlockedThread();
        threadState.waitingState();
        threadState.TimedWaitState();
        threadState.terminateState();
    }
}
