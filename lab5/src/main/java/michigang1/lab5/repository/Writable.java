package michigang1.lab5.repository;


import java.util.ArrayList;

public interface Writable<Shape> {
    void write(ArrayList<Shape> shapes, String path);
}
