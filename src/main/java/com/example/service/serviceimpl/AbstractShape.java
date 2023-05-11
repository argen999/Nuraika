package com.example.service.serviceimpl;

import com.example.service.Shape;

public abstract class AbstractShape implements Shape {

    @Override
    public int compareTo(Shape other) {
        if (this.getArea() != other.getArea()) {
            return Double.compare(this.getArea(), other.getArea());
        } else if (this.getPerimeter() != other.getPerimeter()) {
            return Double.compare(this.getPerimeter(), other.getPerimeter());
        } else {
            return this.getType().compareTo(other.getType());
        }
    }

}
