package com.example.shape;

import com.example.service.serviceimpl.AbstractShape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends AbstractShape {

    private Point point;

    private int radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
