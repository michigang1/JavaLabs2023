package michigang1.lab5.service;

import michigang1.lab5.model.Shape;
import michigang1.lab5.repository.ShapeRepository;
import michigang1.lab5.comparator.AreaComparator;
import michigang1.lab5.comparator.ColorComparator;

import java.util.ArrayList;

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
