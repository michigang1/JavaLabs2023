package michigang1.lab2.utils;

import michigang1.lab2.models.Address;

import java.util.Date;

public class Validator {
    public static boolean isValidName(String name) {
        return name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    }

    public static boolean isValidSurname(String surname) {
        return surname.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    }

    public static boolean isValidDate(String date) {
        // dd/mm/yyyy, dd.mm.yyyy, dd-mm-yyyy
        String dateRegex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-\\.](0?[1-9]|1[012])[\\/\\-\\.](19|20)\\d\\d$";

        return date.matches(dateRegex);
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
    }

    public static boolean isValidAddress(Address address) {
        return address.getStreet().matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$") &&
                address.getHouseNumber().toString().matches("^[0-9]+$") &&
                address.getApartmentNumber().toString().matches("^[0-9]+$");
    }
}
