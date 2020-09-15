package com.hsd.javaee.ex1;

public class Order {
    //订单具有属性：订单号 num,
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Order() {
    }

    public Order(String num) {
        this.num = num;
    }

    //订单中可以添加商品     ,订单与商品之间属于一对多的关联关系
    private Goods[] goods = new Goods[5];
    private int index  = 0;


}
