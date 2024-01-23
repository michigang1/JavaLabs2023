package michigang1.lab5.model;

import michigang1.lab5.model.Shape;

public class CircleShape extends Shape {
    private double radius;

    public CircleShape(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "radius=" + radius +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }
}