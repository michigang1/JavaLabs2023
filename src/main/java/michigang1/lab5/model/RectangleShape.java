package michigang1.lab5.model;

import michigang1.lab5.model.Shape;

public class RectangleShape extends Shape {
    private double width;
    private double height;

    public RectangleShape(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}