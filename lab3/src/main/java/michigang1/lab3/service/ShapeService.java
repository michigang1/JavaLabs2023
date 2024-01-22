package michigang1.lab3.service;

import michigang1.lab3.comparator.AreaComparator;
import michigang1.lab3.comparator.ColorComparator;
import michigang1.lab3.models.Shape;
import michigang1.lab3.repository.ShapeRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ShapeService implements Service {
    private ShapeRepository shapeRepository;
    private AreaComparator areaComparator;
    private ColorComparator colorComparator;

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
        shapeRepository.stub.sort(areaComparator);
        return shapeRepository.stub;

    }

    @Override
    public ArrayList<Shape> getSortedByColor() {
        shapeRepository.stub.sort(colorComparator);
        return shapeRepository.stub;
    }

}
