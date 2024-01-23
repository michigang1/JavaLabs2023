package michigang1.lab5.repository;


import michigang1.lab5.model.Shape;

import java.io.IOException;
import java.util.ArrayList;

public interface Writable<Shape> {
    void write(ArrayList<Shape> shapes, String path);
}
