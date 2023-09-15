import utils.Validator;

import java.util.Map;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = getNameFromInput(in);
        String surname = getSurnameFromInput(in);
        String dateOfBirth = getDateFromInput(in);
        String phone = getPhoneFromInput(in);
        String address = getAddressFromInput(in);

        Student student = new Student(name, surname, dateOfBirth, phone, address);

        System.out.println(student);

    }

    private static String getNameFromInput(Scanner in) {
        String name;
        boolean isValid;
        do{
            System.out.println("Enter the name:");
            name = in.nextLine();
            isValid = Validator.isValidName(name);
        } while (!isValid);
        return name;
    }

    private static String getSurnameFromInput(Scanner in) {
        String surname;
        boolean isValid;
        do{
            System.out.println("Enter the surname:");
            surname = in.nextLine();
            isValid = Validator.isValidSurname(surname);
        } while (!isValid);
        return surname;
    }

    private static String getDateFromInput(Scanner in) {
        String date;
        boolean isValid;
        do{
            System.out.println("Enter the surname:");
            date = in.nextLine();
            isValid = Validator.isValidDate(date);
        } while (!isValid);
        return date;
    }

    private static String getPhoneFromInput(Scanner in) {
        String phone;
        boolean isValid;
        do{
            System.out.println("Enter the number of phone:");
            phone = in.nextLine();
            isValid = Validator.isValidPhone(phone);
        } while (!isValid);
        return phone;
    }

    private static String getAddressFromInput(Scanner in) {
        String address;
        boolean isValid;
        do{
            System.out.println("Enter the address:");
            address = in.nextLine();
            isValid = true;
        } while (!isValid);
        return address;
    }

}

