package com.company;

public class Person extends Thread{
    private boolean status = true;
    public boolean flag = true;

    Person(boolean t){
        this.status = t;
    }

    @Override
    public void run() {
        while(flag){
            Main.test(status);
        }
    }
}
