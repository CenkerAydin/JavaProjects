package Threads;

import java.util.ArrayList;
import java.util.List;

public class RaceCondition implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition=new RaceCondition();

        List<Thread> islemler=new ArrayList<>();
        for (int i=0;i<=100;i++){
            Thread t=new Thread(raceCondition);
            islemler.add(t);
            t.start();
        }
        for (Thread t:islemler){
            t.join();
        }


    }
    private int orderNo;
    private final  Object LOCK=new Object();

    RaceCondition(){
        this.orderNo=1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (LOCK) {
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() + " OrderNo: " + orderNo);
        }
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
