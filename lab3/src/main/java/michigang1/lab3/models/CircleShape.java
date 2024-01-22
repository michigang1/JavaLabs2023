package michigang1.lab3.models;

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
        System.out.println("Drawing circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + getColor() + '\'' +
                '}';
    }
}