package michigang1.lab5.comparator;

import michigang1.lab5.model.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.calcArea(), o2.calcArea());
    }
}
