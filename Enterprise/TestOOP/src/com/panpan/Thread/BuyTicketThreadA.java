package com.panpan.Thread;

/**
 * @author panpan
 * @create 2024-09-06-上午 08:23
 */
public class BuyTicketThreadA extends Thread{
//    final String AA="this";
    static int ticket=10;
    public BuyTicketThreadA(String name){
        super.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            buyTicket();
        }
    }

    public static synchronized void buyTicket(){
            if (ticket>0) {
                System.out.println(" 我从"+Thread.currentThread().getName()+"买到了从上海到深圳的高铁票"+ (ticket--) +"张车票"); //Thread.currentThread().getName()+
            }
        }
    }



class BuyTicket{
    public static void main(String[] args) {
        BuyTicketThreadA buyTicketA=new BuyTicketThreadA("A窗口");
        buyTicketA.start();
        BuyTicketThreadA buyTicketB=new BuyTicketThreadA("B窗口");
        buyTicketB.start();
        BuyTicketThreadA buyTicketC=new BuyTicketThreadA("C窗口");
        buyTicketC.start();
    }
}