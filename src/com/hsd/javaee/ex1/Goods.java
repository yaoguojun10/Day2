package com.hsd.javaee.ex1;

public class Goods {
    private String name;
    private int value;
    private String kind;

    public Goods() {
    }

    public Goods(String name, int value, String kind) {
        this.name = name;
        this.value = value;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public void show(){
        System.out.println("商品的名称为："+ name);
        System.out.println("商品的价值为："+ value);
        System.out.println("商品的种类为："+ kind);

    }
}
