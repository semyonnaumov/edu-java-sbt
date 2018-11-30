import java.lang.reflect.*;

public class Main {
    private final Semaphore semaphore = new SemaphoreImpl(4);

    public void run() {
        semaphore.acquire();
        try {
            doBusinessLogic();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String args[])
    {
        SemaphoreImpl x = new SemaphoreImpl(5);
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {

            })
        }
    }

    private void doBusinessLogic() {
        System.out.println("Hello" + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}