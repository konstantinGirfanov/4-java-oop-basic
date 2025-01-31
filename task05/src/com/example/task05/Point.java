package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    private final double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        return (Math.sqrt((Math.pow(point.x - this.x, 2)) + (Math.pow(point.y - this.y, 2))));
    }
}
