package OS;
import java.time.LocalDate;

public class Contact {

    private int phoneNumber;

    private String name;

    private LocalDate createdContact;

    public Contact(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.createdContact = java.time.LocalDate.now();
    }

    public Contact(int phoneNumber) {
        this(phoneNumber, "unknown");
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
