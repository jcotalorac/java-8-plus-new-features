package com.modernjava.funcionalprogramming.realexample;

import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        AccountFactory accountFactory = BankAccount::new;

        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 50000, "StudentA");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2, 100000, "University");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
    }
}
