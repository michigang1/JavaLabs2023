package michigang1.lab4.road;

import michigang1.lab4.human.Passenger;
import michigang1.lab4.transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private final List<Transport<? extends Passenger>> carsInRoad;

    public Road() {
        this.carsInRoad = new ArrayList<>();
    }

    public int getCountOfHumans() {
        int count = 0;
        for (Transport<? extends Passenger> vehicle : carsInRoad) {
            count += vehicle.getOccupiedSeats();
        }
        return count;
    }

    public void addCarToRoad(Transport<? extends Passenger> vehicle) {
        carsInRoad.add(vehicle);
    }
}