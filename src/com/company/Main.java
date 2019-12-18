package com.company;

public class Main {
    static Person mum = new Person(false);
    static Person boy = new Person(true);
    public static void main(String[] args) {
	mum.start();
	boy.start();
    }
    private static final Object key = new Object();
    private static Account ac = new Account(200);
    public static void test(boolean m){
        try{
            synchronized (key) {
                Thread.sleep(1000);
                if (m){
                    ac.input((int) (Math.random() * 100) % 100 + 1);
                    System.out.println("plus "+ac.getCount());
                }
                else{
                    ac.output((int) (Math.random() * 10) % 4 + 1);
                    System.out.println("minus "+ac.getCount());
                }
                //key.notify();
                //key.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (InsufficientFunds i) {
            System.out.print(i.getMessage());
            boy.flag = false;
            mum.flag = false;
            System.out.println("allblocked");

        }
    }
}
