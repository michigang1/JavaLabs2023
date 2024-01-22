package michigang1.lab3.models;

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
        System.out.println("Drawing rectangle");
    }

    @Override
    public String toString() {
        return  "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                '}';
    }
}