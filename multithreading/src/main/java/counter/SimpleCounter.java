package counter;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCounter {
//    private volatile int counter;

    private final AtomicInteger counter;

    public SimpleCounter() {
        this.counter = new AtomicInteger();
    }

//    public void increment(){
//        synchronized (this) {
//            counter++;
//        }
//    }

    public void increment() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
