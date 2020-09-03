package com.modernjava.funcionalprogramming.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        AccountFactory accountFactory = BankAccount::new;

        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 50000, "StudentA");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2, 100000, "University");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) -> System.out.println("Ending balance of student account: " +
                student.getBalance() + ", University account: " + university.getBalance());

        ExecutorService service = Executors.newFixedThreadPool(10);

    }
}
