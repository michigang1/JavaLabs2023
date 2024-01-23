package michigang1.lab5.repository;

import michigang1.lab5.io.InputReader;
import michigang1.lab5.io.OutputWriter;
import michigang1.lab5.model.Shape;

import java.io.*;
import java.util.ArrayList;

public class ShapeRepository implements Repository, Readable<Shape>, Writable<Shape> {

    public final ArrayList<Shape> stub = new ArrayList<>();
    public final InputReader inputReader = new InputReader();
    public final OutputWriter outputWriter = new OutputWriter();

    @Override
    public ArrayList<Shape> getShapes() {
        return stub;
    }

    @Override
    public void addShape(Shape shape) {
        stub.add(shape);
    }


    @Override
    public ArrayList<Shape> read(String path){
       ArrayList<Shape> shapes = inputReader.readDataFromPath(path);
       stub.clear();
       stub.addAll(shapes);
       return shapes;
    }

    @Override
    public void write(ArrayList<Shape> shapes, String path) {
        outputWriter.writeDataToPath(shapes, path);
    }
}
