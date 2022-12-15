package com.product;

public class ProductVO {
    private int id;
    private int size;
    private String model;
    private String color;
    private String maker;
    private int coupon;
    private int left_num;
    private int sale_num;
    private int price;

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaker() {
        return maker;
    }

    public int getCoupon() {
        return coupon;
    }

    public int getLeft_num() {
        return left_num;
    }

    public int getSale_num() {
        return sale_num;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    public void setLeft_num(int left_num) {
        this.left_num = left_num;
    }

    public void setSale_num(int sale_num) {
        this.sale_num = sale_num;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
