package michigang1.lab5.repository;

import java.util.ArrayList;

public interface Readable<Shape> {

    ArrayList<Shape> read (String path);
}
