package com.example.shape;

import com.example.service.serviceimpl.AbstractShape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends AbstractShape {

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double getArea() {
        double a = getDistance(point1, point2);
        double b = getDistance(point2, point3);
        double c = getDistance(point3, point1);
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a = getDistance(point1, point2);
        double b = getDistance(point2, point3);
        double c = getDistance(point3, point1);
        return a + b + c;
    }

    @Override
    public String getType() {
        return "Triangle: " + point1 + " " + point2 + " " + point3;
    }


    private double getDistance(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
