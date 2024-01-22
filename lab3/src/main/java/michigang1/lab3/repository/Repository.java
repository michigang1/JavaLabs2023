package michigang1.lab3.repository;

import michigang1.lab3.models.Shape;

import java.util.ArrayList;

public interface Repository {

    ArrayList<Shape> getShapes();

    void addShape(Shape shape);

}
