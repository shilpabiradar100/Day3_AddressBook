
import java.util.Scanner;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    public void createContact() {
        ContactDetails contact = new ContactDetails();
        System.out.println("Enter Your First Name: ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.println("Enter your Address: ");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.println("Enter Your City: ");
        String city = scanner.next();
        contact.setCity(city);

        System.out.println("Enter Your State: ");
        String state = scanner.next();
        contact.setState(state);

        System.out.println("Enter Your Zip Code: ");
        int zip = scanner.nextInt();
        contact.setZipCode(zip);

        System.out.println("Enter Your Phone Number: ");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNo(phoneNumber);
    }
}
