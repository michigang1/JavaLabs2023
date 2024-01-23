package michigang1.lab4;

import michigang1.lab4.human.Firefighter;
import michigang1.lab4.human.Policeman;
import michigang1.lab4.road.Road;
import michigang1.lab4.transport.Bus;
import michigang1.lab4.transport.FireEngine;
import michigang1.lab4.transport.PoliceCar;

public class Application {
    public static void main(String[] args) throws Exception {
        Road road = new Road();
        Bus bus = new Bus(10);
        PoliceCar policeCar = new PoliceCar(2);
        FireEngine fireEngine = new FireEngine(4);
        road.addCarToRoad(bus);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireEngine);
        Policeman policeman = new Policeman("Policeman", "Policeman",20);
        policeCar.boardPassenger(policeman);
        policeCar.boardPassenger(new Policeman("Policeman2", "Policeman2",22));
        fireEngine.boardPassenger(new Firefighter("Fire13", "Fire3",23));
        bus.boardPassenger(policeman);
        System.out.println(road.getCountOfHumans());
    }
}
