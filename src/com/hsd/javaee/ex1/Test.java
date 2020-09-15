package com.hsd.javaee.ex1;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        Order order = new Order();
        user.addOrder(order);
    }
}
