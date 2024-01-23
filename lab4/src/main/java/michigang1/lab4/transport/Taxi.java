package michigang1.lab4.transport;

import michigang1.lab4.human.Human;
import michigang1.lab4.human.Passenger;

public class Taxi extends Transport<Passenger> {

    protected Taxi(int maxSeats) {
        super(maxSeats);
    }
}
