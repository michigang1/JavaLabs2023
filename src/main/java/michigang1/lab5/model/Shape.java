package michigang1.lab5.model;

import java.io.Serializable;

public abstract class Shape implements Drawable, Serializable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public abstract String toString();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
