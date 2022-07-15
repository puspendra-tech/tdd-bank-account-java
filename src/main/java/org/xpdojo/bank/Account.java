package org.xpdojo.bank;

public class Account {

    int balance = 0;


    public int addBalance(int amount){

        balance = balance + amount;
        return balance;
    }

}
