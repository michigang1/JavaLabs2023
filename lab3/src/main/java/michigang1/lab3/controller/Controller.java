package michigang1.lab3.controller;

import michigang1.lab3.models.Shape;

public interface Controller {
    void display();

    void getTotalArea();

    void getTotalAreaByType(Class<? extends Shape> shapeType);

    void sortByArea();

    void sortByColor();
}
