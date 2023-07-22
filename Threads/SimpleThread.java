package Threads;

public class SimpleThread extends  Thread{
    @Override
    public void run(){
        String threadName=Thread.currentThread().getName();
        System.out.println("My summation "+threadName +" is started!");

        int total=0;
        for (int i=0;i<1000;i++){
            total +=i;
        }
        System.out.println("Total: "+total);
    }

    public static void main(String[] args) {
        SimpleThread simpleThread =new SimpleThread();
        simpleThread.start();

        SimpleThread simpleThread2 = new SimpleThread();
        simpleThread2.start();
    }
}
