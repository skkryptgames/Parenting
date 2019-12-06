package com.example.parenting.models;

public class Tasks {

    int image;
    String name,type,amount;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Tasks(int image, String name, String type, String amount) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.amount = amount;
    }
}
