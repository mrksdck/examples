package com.example.setter;
/**
 *  a rectangle which gets its values through setters
 */
public class Rectangle implements com.example.Rectangle{

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAreaValue(){
        return width * height;
    }

}
