package com.modernjava.funcionalprogramming.realexample;

@FunctionalInterface
public interface AccountFactory {
    BankAccount getBankAccount(int id, double balance, String accountName);
}
