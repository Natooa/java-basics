package org.nurdiyarapp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread(1);
//        myThread.start();
//
//        MyThread myThread2 = new MyThread(2);
//        myThread2.start();

//        for(int i = 0; i < 5; i++) {
//            var thread = new MyThread(i);
//            thread.start();
//        }

        for(int i = 0; i < 5; i++) {
//            var runnable = new MyRunnable(i);
            var thread = new Thread(() -> {
                System.out.println("hello from thread");
            });
            thread.start();
//            System.out.println(i + " Alive " + thread.isAlive());
//            thread.join();
//            System.out.println(i + " Alive " + thread.isAlive());
        }
    }
}