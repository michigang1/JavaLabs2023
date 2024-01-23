package michigang1.lab4.transport;

import michigang1.lab4.human.Human;
import michigang1.lab4.human.Passenger;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Passenger> {
    private final int maxSeats;
    private final List<T> passengers;

    protected Transport(int maxSeats) {
        this.maxSeats = maxSeats;
        this.passengers = new ArrayList<>();
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getOccupiedSeats() {
        return passengers.size();
    }

    public void boardPassenger(T passenger) {
        if (passengers.size() >= maxSeats) {
            throw new IllegalArgumentException("No more seats available");
        }
        if (passenger.getCurrentTransport() != null) {
            throw new IllegalArgumentException("Passenger already in transport");
        }
        passengers.add(passenger);
        passenger.setCurrentTransport(this);
    }

    public void alightPassenger(T passenger) {
        if (!passengers.remove(passenger)) {
            throw new IllegalArgumentException("Passenger is not in transport");
        }
        passenger.setCurrentTransport(null);
    }
}

