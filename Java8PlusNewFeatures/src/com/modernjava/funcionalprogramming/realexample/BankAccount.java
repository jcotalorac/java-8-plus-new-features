package com.modernjava.funcionalprogramming.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {
    private int id;
    private double balance;
    private String accountName;

    final Lock lock = new ReentrantLock();

    BiFunction<Double, Double, Double> substractFuntion = (a, b) -> a - b;
    BiFunction<Double, Double, Double> addFunction = (a, b) -> a + b;

    public BankAccount(int id, double balance, String accountName) {
        this.id = id;
        this.balance = balance;
        this.accountName = accountName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public boolean withdraw(double amount) {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
