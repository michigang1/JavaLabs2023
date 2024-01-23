package michigang1.lab4.human;

import michigang1.lab4.transport.Transport;

public class Firefighter extends Passenger{
    private String rank = "Firefighter";
    private String department = "Fire Department";

    public Firefighter(String name, String surname, int age) {
        super(name, surname, age);
    }


    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return "Firefighter{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", rank='" + getRank() + '\'' +
                ", department='" + getDepartment() + '\'' +
                '}';
    }
}
