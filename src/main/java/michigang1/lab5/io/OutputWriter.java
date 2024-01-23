package michigang1.lab5.io;

import michigang1.lab5.model.Shape;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OutputWriter {
    public void writeDataToPath(ArrayList<Shape> shapes, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(shapes);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
