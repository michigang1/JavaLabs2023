package michigang1.lab2.models;

import java.util.Date;

public class Student {
    private final String name;
    private final String surname;
    private final String dateOfBirth;
    private  String telephone;
    private final Address address;

    public Student(String name, String surname, String dateOfBirth, String telephone, Address address){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "michigang1.lab2.models.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telephone='" + telephone + '\'' +
                ", address:'" + address + '\'' +
                '}';
    }

}
