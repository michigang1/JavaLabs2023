package michigang1.lab3.comparator;

import michigang1.lab3.models.Shape;

import java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {


    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
