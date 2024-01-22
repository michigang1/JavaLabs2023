package michigang1.lab3.repository;

import michigang1.lab3.models.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ShapeRepository implements Repository{
    public final ArrayList<Shape> stub = new ArrayList<>();
    @Override
    public ArrayList<Shape> getShapes() {
        return stub;
    }

    @Override
    public void addShape(Shape shape) {
         stub.add(shape);
    }


}
