package com.ruoyi.web.controller.common;

import com.ruoyi.rabbitmq.service.Consumer;
import com.ruoyi.rabbitmq.service.Producer;

import java.util.concurrent.Callable;

public class Test extends Thread implements Callable {
    public  int number =10;
    public  int number2 =2;

    @Override
    public Object call() throws Exception {
        return null;
    }

    @Override
    public void run() {

        for (int i=0; i<number; i++) {
            try {
                Thread.sleep(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(number + ":" + "11");
        }
    }

    public static void main(String[] args) {
        Consumer whn = Consumer.getConsumer();
        whn.consumptingno(null);
        for (int i=0; i<50;i++){
            Producer.creatManege("hello---------"+i);
        }

    }
}
