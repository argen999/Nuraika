package com.example.shape;

import com.example.service.serviceimpl.AbstractShape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends AbstractShape {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle() {

    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }

    public double getPerimeter() {
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(bottomRight.getY() - topLeft.getY());
        return 2 * (width + height);
    }

    public String getType() {
        return "Rectangle: " + topLeft + " " + bottomRight;
    }

}
