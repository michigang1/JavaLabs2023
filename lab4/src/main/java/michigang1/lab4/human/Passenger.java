package michigang1.lab4.human;

import michigang1.lab4.transport.Transport;

public class Passenger extends Human{
    private Transport currentTransport;
    public Passenger(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public Transport getCurrentTransport() {
        return this.currentTransport;
    }
}
