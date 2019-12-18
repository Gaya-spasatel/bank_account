package com.company;

public class Account {
    private int count = 0;
    Account(int s){
        this.count = s;
    }
    public int getCount(){
        return this.count;
    }
    public void input(int plus){
        this.count+=plus;
    }
    public void output(int minus) throws InsufficientFunds {
        if (minus<this.count) {
            this.count -= minus;
        } else{
            throw new InsufficientFunds("Not enough money....\n");
        }
    }
}
