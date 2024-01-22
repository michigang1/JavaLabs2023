package michigang1.lab2;

import michigang1.lab2.models.Address;
import michigang1.lab2.models.Journal;
import michigang1.lab2.models.Student;
import michigang1.lab2.utils.Validator;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Journal journal = new Journal();

        while (true) {
            System.out.println("Enter the student's name:");
            String name = in.nextLine();

            if (!Validator.isValidName(name)) {
                System.out.println("Invalid name! Please try again.");
                continue;
            }

            System.out.println("Enter the student's surname:");
            String surname = in.nextLine();

            if (!Validator.isValidSurname(surname)) {
                System.out.println("Invalid surname! Please try again.");
                continue;
            }

            System.out.println("Enter the student's date of birth:");
            String dateOfBirth = in.nextLine();

            if (!Validator.isValidDate(dateOfBirth)) {
                System.out.println("Invalid date of birth! Please try again.");
                continue;
            }

            System.out.println("Enter the student's telephone:");
            String telephone = in.nextLine();

            if (!Validator.isValidPhone(telephone)) {
                System.out.println("Invalid telephone! Please try again.");
                continue;
            }
            System.out.println("Enter the student's address:");
            System.out.println("Enter the street:");
            String street = in.nextLine();

            System.out.println("Enter the house number:");
            Integer houseNumber = in.nextInt();

            System.out.println("Enter the apartment number:");
            Integer apartmentNumber = in.nextInt();

            Address address = new Address(street, houseNumber, apartmentNumber);

            if (!Validator.isValidAddress(address)) {
                System.out.println("Invalid address! Please try again.");
                continue;
            }

            Student student = new Student(name, surname, dateOfBirth, telephone, address);
            journal.addRecord(student);

            System.out.println("Record added successfully!");

            System.out.println("Do you want to add another record? (yes/no)");
            in.nextLine();
            String answer = in.nextLine().toLowerCase();
            if (!answer.equals("yes")) {
                break;
            }
        }
        System.out.println("All records in the journal:");
        for (Student student : journal.getRecords()) {
            System.out.println(student.toString());
        }
    }
}