package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int i=0;
        do {
            Thread.sleep(1000);
            System.out.println("I love Java!");
            i++;
        } while(i<5);
    }
}
