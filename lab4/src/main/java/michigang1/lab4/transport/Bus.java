package michigang1.lab4.transport;

import michigang1.lab4.human.Human;
import michigang1.lab4.human.Passenger;

public class Bus extends Transport<Passenger>{
    public Bus(int maxSeats) {
        super(maxSeats);
    }
}
