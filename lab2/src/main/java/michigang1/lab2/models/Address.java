package michigang1.lab2.models;
public class Address {
    private final String street;
    private final Integer houseNumber;
    private final Integer apartmentNumber;

    public Address(String street, Integer houseNumber, Integer apartmentNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return  "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'';
    }
}
