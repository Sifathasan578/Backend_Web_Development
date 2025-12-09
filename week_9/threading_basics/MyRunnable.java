package threading_basics;

public class MyRunnable implements Runnable { // Runnable is a default interface not custom
    public void run() {
        System.out.println("Worker thread is Running!");
    }
}
