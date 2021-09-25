package com.example.baitap_tuan3;

public class Flower {
    private int anh, price;
    private String name;

    public Flower(int anh, int price, String name) {
        this.anh = anh;
        this.price = price;
        this.name = name;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
