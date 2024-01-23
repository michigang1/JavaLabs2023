package michigang1.lab5.io;

import michigang1.lab5.model.Shape;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InputReader {
    public ArrayList<Shape> readDataFromPath(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (ArrayList<Shape>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
