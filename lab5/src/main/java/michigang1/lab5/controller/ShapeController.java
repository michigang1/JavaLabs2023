package michigang1.lab5.controller;

import michigang1.lab5.model.Drawable;
import michigang1.lab5.model.Shape;
import michigang1.lab5.service.ShapeService;

import java.util.ArrayList;

public class ShapeController implements Controller {
    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }
    @Override
    public void display() {
        shapeService.getShapes().forEach(Drawable::draw);
    }

    @Override
    public void getTotalArea() {
        double totalArea = shapeService.getCalculatedTotalArea();
        System.out.println("Total area of all shapes: " + totalArea);
    }

    @Override
    public void getTotalAreaByType(Class<? extends Shape> shapeType) {
        double totalArea = shapeService.getCalculatedTotalAreaByType(shapeType);
        System.out.println("Total area of all shapes by type: " + totalArea);
    }

    @Override
    public void sortByArea() {
        ArrayList<Shape> shapes = shapeService.getSortedByArea();
        System.out.println("Sorted by area: \n" + shapes);
    }

    @Override
    public void sortByColor() {
        ArrayList<Shape> shapes = shapeService.getSortedByColor();
        System.out.println("Sorted by color: \n" + shapes);
    }
}
