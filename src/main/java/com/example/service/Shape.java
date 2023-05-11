package com.example.service;

public interface Shape extends Comparable<Shape> {

    String getType();

    double getPerimeter();

    double getArea();

}
