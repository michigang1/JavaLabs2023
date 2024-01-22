package michigang1.lab3.models;

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
        System.out.println("Drawing triangle");
    }

    @Override
    public String toString() {
        return  "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                '}';
    }
}