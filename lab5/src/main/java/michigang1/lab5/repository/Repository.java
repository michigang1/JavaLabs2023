package michigang1.lab5.repository;

import michigang1.lab5.model.Shape;

import java.util.ArrayList;

public interface Repository {

    ArrayList<Shape> getShapes();

    void addShape(Shape shape);

}
