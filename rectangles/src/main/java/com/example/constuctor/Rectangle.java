package com.example.constuctor;

/**
 *  a rectangle which gets its values through constructor
 */
public class Rectangle implements com.example.Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getAreaValue(){
        return width * height;
    }

}
