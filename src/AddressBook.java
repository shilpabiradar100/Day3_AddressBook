
import java.util.Scanner;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ContactDetails contact = new ContactDetails();

//    public void createContact() {
//
//        System.out.println("Enter Your First Name: ");
//        String firstName = scanner.next();
//        contact.setFirstName(firstName);
//
//        System.out.println("Enter Your Last Name: ");
//        String lastName = scanner.next();
//        contact.setLastName(lastName);
//
//        System.out.println("Enter your Address: ");
//        String address = scanner.next();
//        contact.setAddress(address);
//
//        System.out.println("Enter Your City: ");
//        String city = scanner.next();
//        contact.setCity(city);
//
//        System.out.println("Enter Your State: ");
//        String state = scanner.next();
//        contact.setState(state);
//
//        System.out.println("Enter Your Zip Code: ");
//        int zip = scanner.nextInt();
//        contact.setZipCode(zip);
//
//        System.out.println("Enter Your Phone Number: ");
//        long phoneNumber = scanner.nextLong();
//        contact.setPhoneNo(phoneNumber);
//    }


    ContactDetails[] contactList = new ContactDetails[10];

    static int i = 0;
    void addcontact() {
        ContactDetails ad1 = new ContactDetails();
        System.out.println("Enter Your First Name: ");
        String firstName = scanner.next();
        ad1.setFirstName(firstName);

        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();
        ad1.setLastName(lastName);

        System.out.println("Enter your Address: ");
        String address = scanner.next();
        ad1.setAddress(address);

        System.out.println("Enter Your City: ");
        String city = scanner.next();
        ad1.setCity(city);

        System.out.println("Enter Your State: ");
        String state = scanner.next();
        ad1.setState(state);

        System.out.println("Enter Your Zip Code: ");
        int zip = scanner.nextInt();
        ad1.setZipCode(zip);

        System.out.println("Enter Your Phone Number: ");
        long phoneNumber = scanner.nextLong();
        ad1.setPhoneNo(phoneNumber);

        contactList[i] = ad1;
        i++;
    }


    void print() {

        for (int j = 0; j < contactList.length; j++) {
            if (contactList[j] == null)
                break;
            System.out.println(contactList[j]);

        }

    }
}
