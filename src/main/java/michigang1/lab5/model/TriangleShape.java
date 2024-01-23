package michigang1.lab5.model;

import michigang1.lab5.model.Shape;

public class TriangleShape extends Shape {
    private double base;
    private double height;

    public TriangleShape(String shapeColor, double base, double height) {
        super(shapeColor);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TriangleShape{" +
                "base=" + base +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}