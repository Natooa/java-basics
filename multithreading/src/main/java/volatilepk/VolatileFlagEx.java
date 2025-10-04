package volatilepk;

public class VolatileFlagEx {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started");
            while(running){
                int x = 0;
                for(int i = 0; i < 1000; i++) {
                    x++;
                }
            }
            System.out.println("Worker ended");
        });
        worker.start();

        Thread.sleep(2000);
        System.out.println("Main: request to stop worker");

        running = false;

        worker.join();
        System.out.println("Main: finish");
    }
}
