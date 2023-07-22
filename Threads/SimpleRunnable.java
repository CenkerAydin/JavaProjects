package Threads;

public class SimpleRunnable implements Runnable{
    private boolean live=true;
    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();

        System.out.println("My summation "+threadName +" is started!");
        int total=0;
        while (live) {
            total += 1;
            System.out.println(total);
            ThreadSleeper.sleep(500);
}
        System.out.println("Total: "+total);
    }
    public void stop(){
        this.live=false;
    }

    public static void main(String[] args) {
        SimpleRunnable simpleRunnable=new SimpleRunnable();
        Thread simpleThread3=new Thread(simpleRunnable);
        simpleThread3.start();
        ThreadSleeper.sleep(10000);
        simpleRunnable.stop();
    }
}
