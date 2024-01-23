import michigang1.lab4.human.Firefighter;
import michigang1.lab4.human.Policeman;
import michigang1.lab4.road.Road;
import michigang1.lab4.transport.Bus;
import michigang1.lab4.transport.FireEngine;
import michigang1.lab4.transport.PoliceCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EndToEndTest {
    private Road road;
    private Bus bus;
    private PoliceCar policeCar;
    private FireEngine fireEngine;

    @BeforeEach
    public void setup() {
        road = new Road();
        bus = new Bus(10);
        policeCar = new PoliceCar(2);
        fireEngine = new FireEngine(4);
    }

    @Test
    public void testBusCapacity() throws Exception {
        for (int i = 0; i < 10; i++) {
            bus.boardPassenger(new Policeman("Policeman" + i, "Policeman" + i, 20 + i));
        }
        assertThrows(Exception.class, () -> bus.boardPassenger(new Policeman("Extra", "Extra", 30)));
    }

    @Test
    public void testPoliceCarCapacity() {
        policeCar.boardPassenger(new Policeman("Policeman1", "Policeman1", 20));
        policeCar.boardPassenger(new Policeman("Policeman2", "Policeman2", 22));
        assertThrows(Exception.class, () -> policeCar.boardPassenger(new Policeman("Extra", "Extra", 30)));
    }

    @Test
    public void testFireEngineCapacity() {
        fireEngine.boardPassenger(new Firefighter("Fire1", "Fire1", 23));
        fireEngine.boardPassenger(new Firefighter("Fire2", "Fire2", 24));
        fireEngine.boardPassenger(new Firefighter("Fire3", "Fire3", 25));
        fireEngine.boardPassenger(new Firefighter("Fire4", "Fire4", 26));
        assertThrows(Exception.class, () -> fireEngine.boardPassenger(new Firefighter("Extra", "Extra", 30)));
    }

    @Test
    public void testBusAlightPassenger() {
        Policeman policeman = new Policeman("Policeman1", "Policeman1", 20);
        bus.boardPassenger(policeman);
        bus.alightPassenger(policeman);
        assertThrows(Exception.class, () -> bus.alightPassenger(policeman));
    }

    @Test
    public void testPoliceCarAlightPassenger() {
        Policeman policeman = new Policeman("Policeman1", "Policeman1", 20);
        policeCar.boardPassenger(policeman);
        policeCar.alightPassenger(policeman);
        assertThrows(Exception.class, () -> policeCar.alightPassenger(policeman));
    }

    @Test
    public void testFireEngineAlightPassenger() {
        Firefighter firefighter = new Firefighter("Fire1", "Fire1", 23);
        fireEngine.boardPassenger(firefighter);
        fireEngine.alightPassenger(firefighter);
        assertThrows(Exception.class, () -> fireEngine.alightPassenger(firefighter));
    }

    @Test
    public void testPassengerAlreadyInTrasport() {
        road.addCarToRoad(bus);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireEngine);
        Policeman policeman = new Policeman("Policeman", "Policeman", 20);
        policeCar.boardPassenger(policeman);
        policeCar.boardPassenger(new Policeman("Policeman2", "Policeman2", 22));
        fireEngine.boardPassenger(new Firefighter("Fire13", "Fire3", 23));
        assertThrows(Exception.class, () -> bus.boardPassenger(policeman));
    }

    @Test
    public void testGetCountOfHumans() throws Exception {
        road.addCarToRoad(bus);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireEngine);
        Policeman policeman = new Policeman("Policeman", "Policeman", 20);
        policeCar.boardPassenger(policeman);
        policeCar.boardPassenger(new Policeman("Policeman2", "Policeman2", 22));
        fireEngine.boardPassenger(new Firefighter("Fire13", "Fire3", 23));
        assertEquals(3, road.getCountOfHumans());
    }
}