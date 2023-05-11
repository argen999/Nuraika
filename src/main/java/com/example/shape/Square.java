package com.example.shape;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(Point topLeft, Point bottomRight) {
        super(topLeft, bottomRight);
    }

    public String toString() {
        return "Square[topLeft=" + getTopLeft() + ", bottomRight=" + getBottomRight() + "]";
    }

}
