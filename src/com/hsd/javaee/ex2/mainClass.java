package com.hsd.javaee.ex2;

public class mainClass {
    public static void main(String[] args) {
        Plan plan = new Plan();
        Birds birds  = new Birds();
        Test test = new Test();
        test.makeFly(plan,birds);
    }
}
