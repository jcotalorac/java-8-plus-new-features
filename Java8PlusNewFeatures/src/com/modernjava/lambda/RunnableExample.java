package com.modernjava.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditional: " + sum);
            }
        };

        new Thread(runnable).start();
    }
}
