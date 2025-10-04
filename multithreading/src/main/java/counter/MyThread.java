package counter;

public class MyThread extends Thread{
    private final SimpleCounter counter;

    private final int threadNum;

    public MyThread(SimpleCounter counter, int threadNum) {
        this.counter = counter;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.println("Thread start num " + threadNum);
        for(int i = 0; i < 5; i++){
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread end num " + threadNum);
    }
}
