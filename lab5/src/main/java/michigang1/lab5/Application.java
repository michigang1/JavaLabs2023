package michigang1.lab5;

import michigang1.lab5.controller.ShapeController;
import michigang1.lab5.model.Shape;
import michigang1.lab5.analyzer.TagFrequencyAnalyzer;
import michigang1.lab5.cipher.CipherStream;
import michigang1.lab5.finder.MaxWordsLineFinder;
import michigang1.lab5.model.CircleShape;
import michigang1.lab5.model.RectangleShape;
import michigang1.lab5.model.TriangleShape;
import michigang1.lab5.repository.ShapeRepository;
import michigang1.lab5.service.ShapeService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String path = getPathFromUser(in, "Define path to file for shapes: ");
        ArrayList<Shape> shapes = createShapes();
        processShapes(path, shapes);
        processCipher(in);
        processMaxWordsLineFinder(in);
        processTagFrequencyAnalyzer();
    }

    private static ArrayList<Shape> createShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new RectangleShape("red", 10, 20));
        shapes.add(new CircleShape("blue", 5));
        shapes.add(new TriangleShape("green", 5, 8));
        return shapes;
    }

    private static void processShapes(String path, ArrayList<Shape> shapes) {
        ShapeRepository repository = new ShapeRepository();
        repository.write(shapes, path);
        repository.read(path);
        ShapeService service = new ShapeService(repository);
        ShapeController controller = new ShapeController(service);
        controller.display();
        controller.getTotalArea();
        controller.sortByArea();
        controller.sortByColor();
    }

    private static void processCipher(Scanner in) throws FileNotFoundException {
        String pathInput = getPathFromUser(in, "Define path to file for input: ");
        String pathEncrypted = getPathFromUser(in, "Define path to file for encryption: ");
        String pathDecrypted = getPathFromUser(in, "Define path to file for decryption: ");
        CipherStream cipher = new CipherStream('K');
        cipher.encrypt(new FileInputStream(pathInput), new FileOutputStream(pathEncrypted));
        cipher.decrypt(new FileInputStream(pathEncrypted), new FileOutputStream(pathDecrypted));
    }

    private static void processMaxWordsLineFinder(Scanner in) {
        String pathMaxWords = getPathFromUser(in, "Define path to file to find max words line: ");
        MaxWordsLineFinder finder = new MaxWordsLineFinder();
        System.out.println(finder.getFromPath(pathMaxWords));
    }

    private static void processTagFrequencyAnalyzer(){
        TagFrequencyAnalyzer analyzer = new TagFrequencyAnalyzer();
        analyzer.analyze("https://www.google.com");
    }

    private static String getPathFromUser(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
}