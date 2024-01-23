package michigang1.lab5.controller;

import michigang1.lab5.model.Shape;

public interface Controller {
    void display();

    void getTotalArea();

    void getTotalAreaByType(Class<? extends Shape> shapeType);

    void sortByArea();

    void sortByColor();
}
