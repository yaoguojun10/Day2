package com.hsd.javaee.ex1;

public class User {
    //用户具有属性：用户名UserName,订单号OrderNum
    private String UserName;
    private String OrderNum;

    public User() {
    }

    public User(String userName, String orderNum) {
        UserName = userName;
        OrderNum = orderNum;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(String orderNum) {
        OrderNum = orderNum;
    }

    //用户可以调用addOrder()方法执行下单,调用goodsShow()方法查看商品信息
    public void addOrder(Order order){

    }
    public void goodsShow(){

    }
}
