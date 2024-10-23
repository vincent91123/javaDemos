package com.panpan.Thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author panpan
 * @create 2024-09-06-上午 09:18
 */
public class threadsC implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(100);
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        threadsC threadsC = new threadsC();
        FutureTask futureTask = new FutureTask(threadsC);
        Thread thread=new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
