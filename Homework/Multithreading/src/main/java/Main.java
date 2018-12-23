import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        Task<String> task = new Task<String>(() -> {
            String originalString = "123123123123123123131231312312313123qweqweqweqweqweqweqweqwe123123123123123";
            String sha256hex = DigestUtils.sha256Hex(originalString);
            return "Result = " + sha256hex;
        });

        Thread thread1 = new Thread(()->{
            System.out.println("Thread1 started");
            System.out.println(task.get());
            System.out.println("Thread1 finished");
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Thread2 started");
            System.out.println(task.get());
            System.out.println("Thread2 finished");
        });

        Thread thread3 = new Thread(()->{
            System.out.println("Thread3 started");
            System.out.println(task.get());
            System.out.println("Thread3 finished");
        });

        Thread thread4 = new Thread(()->{
            System.out.println("Thread4 started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(task.get());
            System.out.println("Thread4 finished");
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
