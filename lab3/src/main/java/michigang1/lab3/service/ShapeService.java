package michigang1.lab3.service;

import michigang1.lab3.comparator.AreaComparator;
import michigang1.lab3.comparator.ColorComparator;
import michigang1.lab3.models.Shape;
import michigang1.lab3.repository.ShapeRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ShapeService implements Service {
    private final ShapeRepository shapeRepository;
    private final AreaComparator areaComparator;
    private final ColorComparator colorComparator;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
        this.areaComparator = new AreaComparator();
        this.colorComparator = new ColorComparator();
    }
    @Override
    public ArrayList<Shape> getShapes() {
        return shapeRepository.stub;
    }
    @Override
    public double getCalculatedTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapeRepository.stub) {
            totalArea += shape.calcArea();
        }
        return totalArea;
    }
    @Override
    public double getCalculatedTotalAreaByType(Class<? extends Shape> shapeType) {
        double totalArea = 0;
        for (Shape shape : shapeRepository.stub) {
            if (shape.getClass() == shapeType) {
                totalArea += shape.calcArea();
            }
        }
        return totalArea;
    }
    @Override
    public ArrayList<Shape> getSortedByArea() {
        ArrayList<Shape> targetShapes = new ArrayList<>(shapeRepository.stub);
        targetShapes.sort(areaComparator);
        return targetShapes;

    }

    @Override
    public ArrayList<Shape> getSortedByColor() {
        ArrayList<Shape> targetShapes = new ArrayList<>(shapeRepository.stub);
        targetShapes.sort(colorComparator);
        return targetShapes;
    }

}
