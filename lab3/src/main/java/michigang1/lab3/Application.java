package michigang1.lab3;

import michigang1.lab3.controller.ShapeController;
import michigang1.lab3.models.CircleShape;
import michigang1.lab3.repository.Repository;
import michigang1.lab3.repository.ShapeRepository;
import michigang1.lab3.service.Service;
import michigang1.lab3.service.ShapeService;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ShapeRepository repository = new ShapeRepository();
        repository.addShape(new CircleShape("yellow", 20));
        repository.addShape(new CircleShape("red", 5));
        repository.addShape(new CircleShape("blue", 10));
        repository.addShape(new CircleShape("green", 15));
        ShapeService service = new ShapeService(repository);
        ShapeController controller = new ShapeController(service);
        controller.display();
        controller.getTotalArea();
        controller.sortByArea();
        controller.sortByColor();
    }
}
