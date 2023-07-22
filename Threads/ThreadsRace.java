package Threads;

import java.util.ArrayList;

public class ThreadsRace {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        ArrayList<Integer> oddNumbers=new ArrayList<>();

        for (int i=1;i<=1000;i++){
            numbers.add(i);
        }
        int threads=4;
        int size=numbers.size()/threads;

        Thread[] threads1=new Thread[threads];

        for (int i=0;i<threads;i++){
            final int start=i*size;
            final int end= (i==threads-1) ? numbers.size(): (i+1)* size;

            threads1[i]=new Thread(() -> {
                for (int j=start;j<end;j++){
                    int num=numbers.get(j);

                    if (num%2==0){
                        synchronized (evenNumbers){
                            evenNumbers.add(num);
                        }
                    }else {
                        synchronized (oddNumbers){
                            oddNumbers.add(num);
                        }
                    }
                }
            });
            threads1[i].start();
        }
        for (Thread thread :threads1){
            try{
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
