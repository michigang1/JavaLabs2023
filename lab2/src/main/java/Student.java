import java.util.Date;

public class Student {
    private final String name;
    private final String surname;

    private final String dateOfBirth;

    private String telephone;



    private final String address;

    public Student(String name, String surname, String dateOfBirth, String telephone, String address){
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

    public String getAddress() {
        return address;
    }

}
