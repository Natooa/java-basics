package org.nurdiyarapp;

public class MyRunnable implements Runnable {
    private final int threadNum;

    MyRunnable(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        if(threadNum == 3){
            throw new RuntimeException();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread " + threadNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
