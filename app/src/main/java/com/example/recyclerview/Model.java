package com.example.recyclerview;

public class Model {
    int number, image;
    String name;

    public Model(int image, int number, String name) {
        this.image = image;
        this.number = number;        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


