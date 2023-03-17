import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

            AddressBook addressBook = new AddressBook();
            Scanner sc = new Scanner(System.in);
            int num;
            char choice = 'y';
            while (choice == 'y') {
                System.out.println("Press: \n 1 for Adding Contact \n 2 for Displaying Contact");
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        addressBook.addcontact();
                        break;

                    case 2:
                        addressBook.print();
                        break;

                }
                System.out.println("Press 'y' to continue else press 'n'");
                choice = sc.next().charAt(0);
            }

            //addressBook.createContact();
        }
    }
