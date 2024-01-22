package michigang1.lab3.service;

import michigang1.lab3.models.Shape;

import java.util.ArrayList;

public interface Service {
    ArrayList<Shape> getShapes();

    double getCalculatedTotalArea();

    double getCalculatedTotalAreaByType(Class<? extends Shape> shapeType);

    ArrayList<Shape> getSortedByArea();

    ArrayList<Shape> getSortedByColor();
}
