package counter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        var counter = new SimpleCounter();


        for(int i = 0; i < 100; i++){
            Thread thread = new MyThread(counter, i);
            thread.start();
            threadList.add(thread);
        }

        System.out.println("for end");

        for(Thread thread : threadList){
            thread.join();
        }

        System.out.println("counter " + counter.get());
    }
}
