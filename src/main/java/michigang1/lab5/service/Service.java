package michigang1.lab5.service;

import michigang1.lab5.model.Shape;

import java.util.ArrayList;

public interface Service {
    ArrayList<Shape> getShapes();

    double getCalculatedTotalArea();

    double getCalculatedTotalAreaByType(Class<? extends Shape> shapeType);

    ArrayList<Shape> getSortedByArea();

    ArrayList<Shape> getSortedByColor();
}
